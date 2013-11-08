
angular.module("dataServiceModule", [])
	.factory("dataService", [
	     function () {
	    	 return new MockDataService();
	     }
	])
	;

function MockDataService() {
	console.log("create mock data service");
}

MockDataService.prototype.getBarGraphData = function() {
	return [12, 14, 17, 57];
}
