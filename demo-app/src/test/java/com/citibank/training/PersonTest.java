package com.citibank.training;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.citibank.demo.Person;
import com.citibank.demo.Triangle;

public class PersonTest {

//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}
//
	
	Person pp;
	@Before
	public void setUp() throws Exception {
		pp= new Person("DEe");
	}
//
//	@After
//	public void tearDown() throws Exception {
//	}
    
    @Test(expected = IllegalArgumentException.class)
    	public void test() {
		new Person("");
		
	}
    @Test
  	public void testforNAme() {
  		assertEquals("DEe", pp.getName());
  		
	
}

}
