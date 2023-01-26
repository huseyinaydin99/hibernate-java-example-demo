/**
 * 
 */
package tr.com.huseyinaydin.caching.level2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
	
	private String cname;
	
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
	
	@Override
	public String toString() {
		return "Customer [aid=" + cid + ", cname=" + cname + "]";
	}
}
