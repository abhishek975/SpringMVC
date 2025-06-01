package com.springcore.ref;

public class A {
private int age;
private B b;
public A() {
	super();
	// TODO Auto-generated constructor stub
}
public A(int age, B b) {
	super();
	this.age = age;
	this.b = b;
}
@Override
public String toString() {
	return "A [age=" + age + ", b=" + b + "]";
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public B getB() {
	return b;
}
public void setB(B b) {
	this.b = b;
}
}
