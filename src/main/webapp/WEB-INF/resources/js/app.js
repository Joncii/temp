var app = angular.module('app', ['ngRoute']);

app.config(['$routeProvider',
	  function($routeProvider) {
	    $routeProvider.
	      when('/login', {
	        templateUrl: 'templates/login.html',
	      }).
	      when('/register', {
	        templateUrl: 'templates/register.html',
	      });
	  }]);

app.controller('RegisterController', function(){
	var vm = this;
	vm.email = 'default@email.com';
	vm.password = 'default';
	
	vm.popup = popup;
	
	function popup(){
		alert(vm.email);
	}
});

app.controller('LoginController', ['$window', function($window){
	var vm = this;
	vm.redirectToRegister = redirectToRegister;
	
	function redirectToRegister(){
		$window.location.href = $window.location.host;
	}
}]);