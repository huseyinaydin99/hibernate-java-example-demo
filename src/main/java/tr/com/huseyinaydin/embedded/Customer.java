/**
 * 
 */
package tr.com.huseyinaydin.embedded;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * @author Huseyin Aydin
 *
 * https://www.linkedin.com/in/huseyin99/
 */

@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	private int cid;
	
	@Transient
	private String cname;
	
	@Column(name="color")
	private String color;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getAname() {
		return cname;
	}
	public void setCname(String aname) {
		this.cname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Customer [aid=" + cid + ", cname=" + cname + ", color=" + color + "]";
	}
}
