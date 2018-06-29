
var app = angular.module("app", [ "ngRoute" ]);

app.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/home', {
		templateUrl : 'home.html'
	});
	$routeProvider.when('/restaurants', {
		templateUrl : 'restaurant.html',
		controller : 'restaurantCtrl'
	});
	$routeProvider.when('/user', {
		templateUrl : 'user.html',
		controller : 'userCtrl'
	});
	$routeProvider.when('/items', {
		templateUrl : 'items.html',
		controller : 'itemsCtrl'
	});
	$routeProvider.otherwise({
		redirectTo : '/home'
	});
} ]);

app.controller("restaurantCtrl", function($scope, $http) {

	$scope.fetchRestaurant = function() {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/restaurant/getAll'
		}).success(function(data, status) {
			console.log(data);
			$scope.status = status;
			$scope.restaurants = data;
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};
	
	
	$scope.saveRestaurant = function() {
		$http({
			method : 'POST',
			url : 'http://localhost:8080/restaurant/add',
			headers: { 'Content-Type': 'application/json' },
			data:$scope.restaurant
		}).success(function(data, status) {
			console.log(data);
			$scope.fetchRestaurant();
			$scope.restaurants = data;
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};

});
app.controller("userCtrl", function($scope, $http) {

	$scope.fetchUser = function() {
		$http({
			method : 'GET',
			url : 'http://localhost:8080/user/getAll'
		}).success(function(data, status) {
			console.log(data);
			$scope.status = status;
			$scope.user = data;
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};
	
	
	$scope.saveUser = function() {
		$http({
			method : 'POST',
			url : 'http://localhost:8080/user/add',
			headers: { 'Content-Type': 'application/json' },
			data:$scope.user
		}).success(function(data, status) {
			console.log(data);
			$scope.fetchUser();
			$scope.user = data;
		}).error(function(data, status) {
			$scope.status = status;
			$scope.data = "Request failed";
		});
	};

});

app.controller("itemsCtrl", function($scope, $http) {
	
		$scope.fetchItem = function() {
			$http({
				method : 'GET',
				url : 'http://localhost:8080/restaurant/getItems'
			}).success(function(data, status) {
				console.log(data);
				$scope.status = status;
				$scope.items = data;
			}).error(function(data, status) {
				$scope.status = status;
				$scope.data = "Request failed";
			});
		};
		$scope.saveItems = function() {
			$http({
				method : 'POST',
				url : 'http://localhost:8080/restaurant/additem',
				headers: { 'Content-Type': 'application/json' },
				data:$scope.item
			}).success(function(data, status) {
				console.log(data);
				$scope.fetchItem();
				$scope.item = data;
			}).error(function(data, status) {
				$scope.status = status;
				$scope.data = "Request failed";
			});
		};
})