var app = angular.module('app', [ 'ngRoute' ]);

app.config([ '$routeProvider', function($routeProvider) {
    $routeProvider.when('/summary', {
        templateUrl : 'templates/summary.html'
    })
    .when('/', {
        templateUrl : 'templates/summary.html'
    })
    .when('/foodbase', {
        templateUrl : 'templates/foodbase.html'
    })
    .when('/addFood', {
        templateUrl : 'templates/addFood.html'
    });
} ]);

app.factory('RegisterDao', [ '$http', function($http) {

    return {
        registerUser : function(user) {
            var userData = {
                email : user.email,
                password : user.password
            };

            $http.post('/webshop/register', userData);
        }
    };

} ]);

app.controller('RegisterController', [ 'RegisterDao', function(RegisterDao) {
    var vm = this;

    vm.register = register;

    function register() {
        var user = {
            email : vm.email,
            password : vm.password,
            repassword : vm.repassword
        };
        RegisterDao.registerUser(user);
    }
} ]);

app.controller('LoginController', [ '$window', function($window) {
    var vm = this;
    vm.redirectToRegister = redirectToRegister;

    function redirectToRegister() {
        $window.location.href = $window.location.host;
    }
} ]);

app.controller('NavbarController', function(){
    var vm = this;
    var activeTab;
    
    vm.changeTab = changeTab;
    
    function changeTab(id){
        var newTab = angular.element(document).find('#' + id);
        if(newTab[0].id != activeTab[0].id){
            newTab.addClass('active');
            activeTab.removeClass('active');
            activeTab = newTab;
        }
    }
    
    function initActiveTab(){
        activeTab = angular.element(document).find('#summary');
    }
    
    initActiveTab();
});

app.controller('AddFoodController', [ '$http', '$window', function($http, $window){
    var vm = this;
    
    vm.addFood = addFood;
    
    vm.food = {
    		name : "",
    		carbohydrate : {
    			weightPortion : {
    				value : 0,
        			metric : 'g'
    			}
    		},
    		protein : {
    			weightPortion : {
    				value : 0,
        			metric : 'g'
    			}
    		},
    		fat : {
    			weightPortion : {
    				value : 0,
        			metric : 'g'
    			}
    		}
    }
    
    function retrieveMetrics(){
        $http.get("/webshop/food/metrics").then(
        		function(response){
        			vm.metrics = response.data;
        		},
        		function(){});
    }
    
    retrieveMetrics();
    
    function addFood(){
    	$http.put("/webshop/food/add", vm.food).then(redirectToAddFood, redirectToAddFood);
    }
    
    function redirectToAddFood(){
    	$window.location.href = '/webshop/#addFood';
    }
    
}]);

app.controller('FoodBaseController', [ '$http', function($http){
	var vm = this;
	
	vm.shownFood = null;
	
	vm.retrieveFood = retrieveFood;
	
	function retrieveFoods(){
		$http.get("/webshop/foods").then(
        		function(response){
        			vm.foodList = response.data;
        		},
        		function(){});
	}
	
	function retrieveFood(id){
		$http.get("/webshop/food/" + id).then(
        		function(response){
        			vm.shownFood = response.data;
        		},
        		function(){});
	}
	
	retrieveFoods();
}]);