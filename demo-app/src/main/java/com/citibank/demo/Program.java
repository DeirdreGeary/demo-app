package com.citibank.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.citibank.demo.jdbc.CustomerManager;
@SpringBootApplication
public class Program {
	 public static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
	    public static final String MYSQL_URL = "jdbc:mysql://localhost/Northwind?"
	                                            + "user=root&password=root";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This is not the recommended way to test code
		//Should use Junit
//		Calculator c= new Calculator();
//		int result =c.Add(1, 4);
//		
//		if (result==5)
//		{
//			System.out.println("Calculator Add Method passed");			
//		}		
//	
//	
//	 
//	        CustomerManager dao = new CustomerManager(MYSQL_DRIVER,MYSQL_URL);
//	        try{
//	        dao.readData();}
//	        catch (Exception e) {
//				// TODO: handle exception
//	        	System.out.println(e.toString());
//			}
		SpringApplication.run(Program.class, args);
	}
}

