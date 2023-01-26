/**
 * 
 */
package tr.com.huseyinaydin.embedded.relations;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

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
	
	@ManyToMany
	private List<Student> student = new ArrayList<Student>();

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

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
}
