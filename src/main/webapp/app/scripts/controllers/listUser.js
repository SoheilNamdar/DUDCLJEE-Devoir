			var app = angular.module('myApp', []);
			app.controller('customersCtrl', function($scope, $http) {
			$http.get("user.php").then(function (response) {
				$scope.myData = response.data.records;
				});
			});