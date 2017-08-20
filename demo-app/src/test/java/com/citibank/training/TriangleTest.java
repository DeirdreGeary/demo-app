package com.citibank.training;
/*
 
 Hamcrest is a framework that assists writing software tests in the Java programming language. 
 It supports creating customized assertion matchers ('Hamcrest' is an anagram of 'matchers'), 
 allowing match rules to be defined declaratively.
  These matchers have uses in unit testing frameworks such as JUnit and jMock.

http://www.vogella.com/tutorials/Hamcrest/article.html

List<Integer> list = Arrays.asList(5, 2, 4);
        assertThat(list, hasSize(3));
        // ensure the order is correct
        assertThat(list, contains(5, 2, 4));
        assertThat(list, containsInAnyOrder(2, 4, 5));


*/
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//import java.util.Arrays;
import java.util.List;

import com.citibank.demo.Triangle;

public class TriangleTest {
	
	@Test
	public void testSimpleTriangleFromArrayOfSides()
	{	//arrange & Act
		Triangle t= new Triangle(3,2, 4);
		List<Double> sides=t.getSides();
    
		
		
		
		//assert
		 assertEquals(sides.size(), 3);
		 //hamscrest
	     assertThat(sides, containsInAnyOrder(2.0,3.0,4.0));
	     assertThat(sides, contains(2.0,3.0,4.0));
 	}
	 @Test(expected = IllegalArgumentException.class)
	    public void testInvalidTriangle(){
	    	new Triangle(new double[]{1,2,3});
	    }

	    

	    @Test(expected = IllegalArgumentException.class)
	    public void testInvalid2ItemArrayConstrutorTriangle(){
	    	new Triangle(new double[]{1,2});
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testInvalid4ItemArrayConstrutorTriangle(){
	    	new Triangle(new double[]{1,2,3,4});
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testInvalidTriangleSide0(){
	        new Triangle(new double[]{-2,3,4});
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testInvalidTriangleSide1(){
	        new Triangle(new double[]{2,-3,4});
	    }

	    @Test(expected = IllegalArgumentException.class)
	    public void testInvalidTriangleSide2(){
	        new Triangle(new double[]{2,3,-4});
	    }

	    @Test
	    public void testEquilateralTriangles(){
	    	Triangle t = new Triangle(new double[]{3,3,3});
	        assertTrue(t.isEquilateral());
	        t = new Triangle(new double[]{2,3,4});
	        assertFalse(t.isEquilateral());
	    }

	    @Test
	    public void testIsoscelesTriangles(){
	    	Triangle t = new Triangle(new double[]{3,3,2});
	        assertTrue(t.isIsosceles());
	        t = new Triangle(new double[]{2,3,4});
	        assertFalse(t.isIsosceles());
	        t = new Triangle(new double[]{3,3,3});
	        assertFalse(t.isIsosceles());
	    }

	    @Test
	    public void testRightAngledTriangles(){
	    	Triangle t = new Triangle(new double[]{2,3,4});
	        assertFalse(t.isRightAngled());
	        t = new Triangle(new double[]{3,4,5});
	        assertTrue(t.isRightAngled());
	        t = new Triangle(new double[]{2,2,Math.sqrt(8)});
	        assertTrue(t.isRightAngled());
	    }
}
