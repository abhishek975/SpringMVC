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
        session.beginTransaction();
        session.save(st);
        session.save(ad);
        session.getTransaction().commit();
        
        session.close();
    }
}
