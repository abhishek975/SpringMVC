package com.springcore.ref;

public class B {
   private int age;

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public B() {
	super();
	// TODO Auto-generated constructor stub
}

public B(int age) {
	super();
	this.age = age;
}

@Override
public String toString() {
	return "B [age=" + age + "]";
}
}
