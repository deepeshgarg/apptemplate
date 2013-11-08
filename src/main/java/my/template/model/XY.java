package my.template.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="root")
@Entity (name = "xy")
public class XY {
	private String x;
	private String y;
	
	/**
	 * Get x.
	 *
	 * @return x as String.
	 */
	@Column (name = "x")
	public String getX()
	{
	    return x;
	}
	
	/**
	 * Set x.
	 *
	 * @param x the value to set.
	 */
	public void setX(String x)
	{
	    this.x = x;
	}
	
	/**
	 * Get y.
	 *
	 * @return y as String.
	 */
	@Column (name="y")
	public String getY()
	{
	    return y;
	}
	
	/**
	 * Set y.
	 *
	 * @param y the value to set.
	 */
	public void setY(String y)
	{
	    this.y = y;
	}
}
