/**
 * 
 */
package tr.com.huseyinaydin.fetch;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Huseyin Aydin
 *
 *         https://www.linkedin.com/in/huseyin99/
 */

@Entity
@Table(name = "Customer")
public class Customer {

	@Id
	private int aid;
	
	private String cname;

	@OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
	private Collection<Laptop> laps = new ArrayList<Laptop>();

	public Collection<Laptop> getLaps() {
		return laps;
	}

	public void setLaps(Collection<Laptop> laps) {
		this.laps = laps;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + cname + " ]";
	}
}
