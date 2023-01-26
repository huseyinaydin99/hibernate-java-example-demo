/**
 * 
 */
package tr.com.huseyinaydin.get.vs.load;

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
        
//      Laptop lap = (Laptop) session.get(Laptop.class, 201);
        Laptop lap = (Laptop) session.load(Laptop.class, 201);      //Proxy

          
//      try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
  
        System.out.println(lap);
        session.getTransaction().commit();
    }
}
