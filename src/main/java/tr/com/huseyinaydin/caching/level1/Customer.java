/**
 * 
 */
package tr.com.huseyinaydin.caching.level1;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * @author Huseyin Aydin
 *
 *         https://www.linkedin.com/in/huseyin99/
 */

@Entity
@Table(name = "Customer")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
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
