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