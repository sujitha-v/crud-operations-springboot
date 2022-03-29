package com.example.demo;



public class Person {
	
	String firstName;
	String lastName;
	String id;
	int age;
	String designation;
	
	
public Person(String firstName, String lastName, String id, int age, String designation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.age = age;
		this.designation = designation;
	}
public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
public Person(String firstName, String lastName, String id, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.age = age;
	}
public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
public Person(String firstName, String lastName, String id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}
public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


public Person() {
	super();
}

}
