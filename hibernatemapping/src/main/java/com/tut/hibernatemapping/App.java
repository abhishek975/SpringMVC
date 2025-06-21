package com.tut.hibernatemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("com/tut/hibernatemapping/hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	 Question q1=new Question();
    	 q1.setQuestionId(1);
    	 q1.setQuestion("Whats your nickname");
    	 
    	 Answer a=new Answer();
    	 a.setAnswerId(1);
    	 a.setAnswer("Patty");
    	 
    	 q1.setAnswer(a);
    	 
    	 Session session=factory.openSession();
    	 Transaction tx=session.beginTransaction();
    	 session.save(a);
    	 session.save(q1);
    	 tx.commit();
    	session.close();
    	factory.close();
        System.out.println( "Hello World!" );
    }
}
