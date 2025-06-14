package com.tut.ProjectwithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    { 
    	
    	SessionFactory factory=new Configuration().configure("com/tut/ProjectwithMaven/hibernate.cfg.xml").buildSessionFactory();
        System.out.println(factory); 
        
        //creating student 
        Student st=new Student();
      
        st.setCity("Delhi");
        st.setName("Abhi");
        System.out.println(st); 
        
        Address ad= new Address();
        ad.setCity("Delhi");
        ad.setStreet("SouthDelhi");
        
        Session session=factory.openSession();
        
        Student student=(Student)session.get(Student.class,1); //get method initialize and hit the database on object instantiation itself
        Address address=(Address)session.get(Address.class,2);
        
        Student student2=(Student)session.get(Student.class,1);//By calling same object ,hibernate uses caching concept
        Student student3=(Student)session.get(Student.class,2);
//        session.beginTransaction();
//        session.save(st);
//        session.save(ad);
//        session.getTransaction().commit();
        
        session.close();
        factory.close();
    }
}
