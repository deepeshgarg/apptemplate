

angular.module("dataServiceModule", [])
	.factory("dataService", ['$http', 
	     function (http) {
	    	 return new DataService(http);
	     }
	])
	;

function DataService(http) {
	console.log("create mock data service");
	this.http = http;
}

DataService.prototype.getBarGraphData = function() {
	return [12, 14, 17, 57];
}

