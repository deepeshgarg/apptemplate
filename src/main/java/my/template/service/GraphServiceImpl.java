package my.template.service;

import java.util.ArrayList;
import java.util.List;

import my.template.model.Graph;
import my.template.model.XY;

import org.springframework.stereotype.Component;

@Component("graphService")
public class GraphServiceImpl implements GraphService {

	@Override
	public Graph getGraph() {
		List<XY> xyList = new ArrayList<XY>();
		XY xy = new XY();
		xy.setX("10");
		xy.setY("20");
		xyList.add(xy);
		xy = new XY();
		xy.setX("20");
		xy.setY("30");
		xyList.add(xy);
		Graph graph = new Graph();
		graph.setXyList(xyList);
		return graph;
	}
	
	@Override
	public List<Integer>getBarData() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12); list.add(26); list.add(10); list.add(43); list.add(21);
		return list;
	}
}
