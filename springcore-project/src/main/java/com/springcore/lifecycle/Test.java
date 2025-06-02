package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		 Book b=(Book) context.getBean("book");
		 System.out.println(b.toString());
	}

}
