/**
 * 
 */
package tr.com.huseyinaydin.embedded;

import javax.persistence.Embeddable;

/**
 * @author Huseyin Aydin
 *
 * https://www.linkedin.com/in/huseyin99/
 */

@Embeddable
public class CustomerName {
	private String fname;
	private String lname;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	@Override
	public String toString() {
		return "CustomerName [fname=" + fname + ", lname=" + lname + "]";
	}
}
