var myApp = angular.module('myApp',[]);

myApp.controller("exemple1Ctrl", function($scope){
    $scope.myFunc = function(){
	    <!--if($scope.submit)-->
        return ($scope.p1 >= $scope.p2) ? $scope.p1 : $scope.p2;    
    };
});