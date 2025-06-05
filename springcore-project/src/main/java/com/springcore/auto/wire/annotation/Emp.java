package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	//@Autowired   //Autowire byType
 private Address address;

public Address getAddress() {
	return address;
}
@Autowired //Autowire byName
public void setAddress(Address address) {
	this.address = address;
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}

public Emp(Address address) { //Autowiring by constructor checks byType
	super();
	this.address = address;
	System.out.println("Constructor is called");
}

public Emp() {  
	super();
	// TODO Auto-generated constructor stub
}
}
