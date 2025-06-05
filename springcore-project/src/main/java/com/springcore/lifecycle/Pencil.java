package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pencil implements InitializingBean,DisposableBean {
  private double price;

public Pencil(double price) {
	super();
	this.price = price;
}

public double getPrice() {
	return price;
}

@Override
public String toString() {
	return "Pencil [price=" + price + "]";
}

public void setPrice(double price) {
	this.price = price;
}

public Pencil() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Buying Pencil");
}

@Override
public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("Ok pencil is used");
}
}
