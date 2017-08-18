package com.citibank.demo;

public class Program {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This is not the recommended way to test code
		//Should use Junit
		Calculator c= new Calculator();
		int result =c.Add(2, 3);
		if (result==5)
		{
			System.out.println("Calculator Add Method passed");
			
		}		

}
}

