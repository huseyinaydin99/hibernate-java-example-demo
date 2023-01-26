/**
 * 
 */
package tr.com.huseyinaydin.fetch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Huseyin Aydin
 *
 * https://www.linkedin.com/in/huseyin99/
 */
public class Main {
	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Customer.class);    
        SessionFactory sf = config.buildSessionFactory();   
        Session session = sf.openSession();
        
        session.beginTransaction();
        
        Customer a1 = (Customer) session.get(Customer.class, 1);
        
        System.out.println(a1.getCname());
//        Collection<Laptop> laps = a1.getLaps();
//        
//        for(Laptop l : laps)
//        {
//        	System.out.println(l);
//        }

        session.getTransaction().commit();
	}
}
