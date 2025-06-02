package com.springcore.lifecycle;

public class Book {
   private int price;

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	System.out.println("First, values are getting set");
	this.price = price;
}

@Override
public String toString() {
	return "Book [price=" + price + "]";
}

public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public void init() { //We can customize these method and can also change their names
	System.out.println("Then initialization method is called");
}
public void destroy() {
	System.out.println("This is completion method");
}
}
