
angular.module('graphDirectiveModule', []).
	directive("d3BarGraph", function() {
        return {
            restrict: 'E',
            templateUrl: 'js/app/directive/bar-graph-tmpl.html',
            scope : {
                data: "=data",

            },
            controller: function ($scope) {
                $scope.sum = function () {
                    var s = 0;
                    for (var i = 0; i < $scope.data.length; i++) {
                        s += parseInt($scope.data[i]);
                    }
                    return s;
                }
            },
            link: function (scope, elm, attrs) {
                scope.count = function() {
                    return scope.data.length;
                };
                scope.$watch('data', function(newVal) {
                    //console.log(elm[0]);
                	if (!newVal) {
                		return;
                	}
                    d3.select(elm[0]).select("svg").remove();
                    var chart = d3.select(elm[0]).append("svg")
                         .attr("class", "chart")
                         .attr("width", 440)
                         .attr("height", 140)
                       .append("g")
                         .attr("transform", "translate(10,15)");

                    var x = d3.scale.linear()
                         .domain([0, d3.max(newVal)])
                         .range([0, 420]);
                        
                    chart.selectAll("rect")
                         .data(newVal)
                       .enter().append("rect")
                         .attr("y", function(d, i) { return i * 20; })
                         .attr("width", x)
                         .attr("height", 20);
                         
                    chart.selectAll("line")
                         .data(x.ticks(10))
                       .enter().append("line")
                         .attr("x1", x)
                         .attr("x2", x)
                         .attr("y1", 0)
                         .attr("y2", 120)
                         .style("stroke", "#ccc");
                    chart.selectAll(".rule")
                         .data(x.ticks(10))
                       .enter().append("text")
                         .attr("class", "rule")
                         .attr("x", x)
                         .attr("y", 0)
                         .attr("dy", -3)
                         .attr("text-anchor", "middle")
                         .text(String);
                    chart.append("line")
                         .attr("y1", 0)
                         .attr("y2", 120)
                         .style("stroke", "#000");
                        
                }, true);
            }
        }
    }
);