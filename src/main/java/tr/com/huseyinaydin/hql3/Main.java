/**
 * 
 */
package tr.com.huseyinaydin.hql3;
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
        Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);    
        ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        SessionFactory sf = config.buildSessionFactory(registry);   
        Session session = sf.openSession();
        session.beginTransaction();
        
        //Native Queries..
        
//      SQLQuery query = session.createSQLQuery("select * from student where marks>60");
        SQLQuery query = session.createSQLQuery("select name, marks from student where marks > 60");
        
//      query.addEntity(Student.class);
        
        
//      List<Student> students = query.list();
          
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
          
        List students = query.list();
        
        for(Object o : students)
        {
        	Map m = (Map)o;
        	System.out.println(m.get("name") + " : " + m.get("marks"));
        }
  
        session.getTransaction().commit();

    }
}
