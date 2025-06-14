package com.tut.ProjectwithMaven;

import javax.persistence.*;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
  private int addressId;
  private String street;
  private String city;
public int getAddressId() {
	return addressId;
}
public void setAddressId(int addressId) {
	this.addressId = addressId;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + "]";
}
public Address(int addressId, String street, String city) {
	super();
	this.addressId = addressId;
	this.street = street;
	this.city = city;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
  
}
