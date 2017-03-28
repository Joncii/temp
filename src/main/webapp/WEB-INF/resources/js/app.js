var app = angular.module('app', [ 'ngRoute' ]);

app.config([ '$routeProvider', function($routeProvider) {
    $routeProvider.when('/summary', {
        templateUrl : 'templates/summary.html'
    })
    .when('/', {
        templateUrl : 'templates/summary.html'
    })
    .when('/register', {
        templateUrl : 'templates/summary.html'
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