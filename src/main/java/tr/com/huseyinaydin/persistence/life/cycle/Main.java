/**
 * 
 */
package tr.com.huseyinaydin.persistence.life.cycle;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
/**
 * @author Huseyin Aydin
 *
 * https://www.linkedin.com/in/huseyin99/
 */
public class Main {
	public static void main( String[] args )
    {
        Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class);
		SessionFactory sf = config.buildSessionFactory();   
        Session session = sf.openSession();
        
        session.beginTransaction();
        
        Laptop l = new Laptop();
        l.setLid(52);
        l.setBrand("Lenovo");
        l.setPrice(800);
        
        session.save(l);
        l.setPrice(750);
        
//

//      session.remove(l);
  
        session.getTransaction().commit();
//      session.detach(l);
        l.setPrice(600);
  

    }
}
