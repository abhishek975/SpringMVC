package com.springcore.employees;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/employees/configuration.xml");
	        Emp employee=(Emp)context.getBean("employee");
	        System.out.println(employee);
	       System.out.println( employee.getAddresses());
	}

}
