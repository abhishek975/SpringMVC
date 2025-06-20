package com.springcore.auto.wire;

public class Emp {
 private Address address;

public Address getAddress() {
	return address;
}

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
