package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/ref/configref.xml");
		 A a=(A) context.getBean("A");
		 System.out.println(a.getB().getAge());
		 System.out.println(a);
		 
	}

}
