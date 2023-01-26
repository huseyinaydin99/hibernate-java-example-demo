/**
 * 
 */
package tr.com.huseyinaydin.caching.level1;

import java.util.Collection;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
/**
 * @author Huseyin Aydin
 *
 * https://www.linkedin.com/in/huseyin99/
 */


public class Main 
{
    public static void main( String[] args )
    {
    	Customer a = null;
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Customer.class);    
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);   
        Session session1 = sf.openSession();
        session1.beginTransaction();
  
        Query q1 = session1.createQuery("from Customer where cid=1");
        q1.setCacheable(true);
        a = (Customer) q1.uniqueResult();
        System.out.println(a);
        
        a = (Customer) session1.get(Customer.class, 101);
        System.out.println(a);
        
        session1.getTransaction().commit();
        session1.close();
        
        Session session2 = sf.openSession();
        session2.beginTransaction();
        
        Query q2 = session2.createQuery("from Customer where aid=101");
        q2.setCacheable(true);
        a = (Customer) q2.uniqueResult();
        System.out.println(a);
        
        a = (Customer) session2.get(Customer.class, 101);
        System.out.println(a);
        
        session2.getTransaction().commit();
        session2.close();
    }
}