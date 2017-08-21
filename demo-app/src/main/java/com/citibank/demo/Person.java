package com.citibank.demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class Person {
public Person(String name) {
		
		setName(name);
	}

private String name;

public String getName() {
	return name;
}




public void setName(String name) {	
	if (name ==null ) {
	throw new IllegalArgumentException("Name can't be blank");
	}

	if (name.isEmpty() ) {
	throw new IllegalArgumentException("Name can't be empty");
	}

	this.name = name;
}

}
