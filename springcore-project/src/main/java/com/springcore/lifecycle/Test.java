package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		 Book b=(Book) context.getBean("book");
		 System.out.println(b.toString());
		 context.registerShutdownHook(); //To see destroy method to run
	}

}
