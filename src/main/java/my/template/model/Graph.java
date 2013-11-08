package my.template.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Graph {

	List<XY> xyList;

	public List<XY> getXyList() {
		return xyList;
	}

	public void setXyList(List<XY> xyList) {
		this.xyList = xyList;
	}
}
