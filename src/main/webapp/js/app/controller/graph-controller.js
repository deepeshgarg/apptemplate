
angular.module('graphControllerModule', []).
	controller('graphController', ['$scope', "dataService", function ($scope, dataService) {
		$scope.a = 'A';
		$scope.data = [10, 20, 30, 40];
		
		$scope.refresh = function () {
			$scope.data = dataService.getBarGraphData();
		}
	}])