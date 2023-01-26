/**
 * 
 */
package tr.com.huseyinaydin.fetch;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author Huseyin Aydin
 *
 * https://www.linkedin.com/in/huseyin99/
 */

@Entity
public class Laptop {
	@Id
	private int lid;
	
	private String lname;
	
	@ManyToOne
	private List<Customer> customer = new ArrayList<Customer>();

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
}
