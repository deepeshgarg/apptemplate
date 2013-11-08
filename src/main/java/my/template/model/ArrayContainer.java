package my.template.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="root")
public class ArrayContainer {
	Integer[] array;

	public Integer[] getArray() {
		return array;
	}

	public void setArray(Integer[] array) {
		this.array = array;
	}
}
