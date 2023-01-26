package tr.com.huseyinaydin.hql1;

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
public class Main {
	public static void main( String[] args )
    {
        Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);    
        ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        SessionFactory sf = config.buildSessionFactory(registry);   
        Session session = sf.openSession();
        
        session.beginTransaction();
        
//        Query q = session.createQuery("from Student");     //(Tüm öğrencileri çektik.)
//          Query q = session.createQuery("from Student where marks > 50");      //(marks kolonu 50'den büyük olan öğrencileri çektik)
          
//        List<Student> students = q.list();
        
        Query q = session.createQuery("from Student where rollno=2");
        Student student = (Student) q.uniqueResult();
        
        System.out.println(student);
        
        
//        for(Student s : students)
//        {
//        	System.out.println(s);
//        }
//        
//        Random r = new Random();
//        
//        
//        for(int i=1;i<=50;i++)
//        {
//        	Student s = new Student();
//        	s.setRollno(i);
//        	s.setName("Name" + i);
//        	s.setMarks(r.nextInt(100));
//        	session.save(s);
//        }
        session.getTransaction().commit();
    }
}
