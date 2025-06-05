package com.springcore.auto.wire.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
  public static void main(String args[]) {
	  AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/lifecycleconfig.xml"); 
	  context.registerShutdownHook(); 
	  Emp e=(Emp)context.getBean("employee");
	  System.out.println(e.toString());
  }
}
