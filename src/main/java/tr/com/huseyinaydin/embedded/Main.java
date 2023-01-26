/**
 * 
 */
package tr.com.huseyinaydin.embedded;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * @author Huseyin Aydin
 *
 * https://www.linkedin.com/in/huseyin99/
 */
public class Main {
	public static void main(String[] args) {
		Customer musteri = new Customer();
		musteri.setCid(101);
		musteri.setCname("Hüseyin");
		musteri.setColor("Orange");

		Configuration con = new Configuration().configure().addAnnotatedClass(Customer.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(musteri);
		
		
		musteri = (Customer) session.get(Customer.class, 1);
		tx.commit();
		
		System.out.println(musteri);
	}
}
