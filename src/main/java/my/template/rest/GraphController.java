package my.template.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import my.template.model.Graph;
import my.template.model.ArrayContainer;
import my.template.service.GraphService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@Path("/")
public class GraphController {

	@Autowired
	GraphService graphService;
	
	@GET
	@Path("graph")
	@Produces("application/json")
	public Response getGraph() {
		Graph graph = graphService.getGraph();
		return Response.ok().entity(graph).type(MediaType.APPLICATION_JSON).build();
	}

	@GET
	@Path("bar")
	@Produces("application/json")
	public Response getBar() {
		List<Integer> data = graphService.getBarData();
		ArrayContainer listContainer = new ArrayContainer();
		listContainer.setArray(data.toArray(new Integer[0]));
		return Response.ok().entity(listContainer).type(MediaType.APPLICATION_JSON).build();
	}
	
	public GraphService getGraphService() {
		return graphService;
	}

	public void setGraphService(GraphService graphService) {
		this.graphService = graphService;
	}
}
