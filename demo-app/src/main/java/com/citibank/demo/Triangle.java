package com.citibank.demo;

import java.util.Arrays;
import java.util.List;

public class Triangle {
	private double sides[] = new double[3];

	public Triangle(double[] sides) {

		this.sides = Arrays.copyOf(sides, sides.length);
		Arrays.sort(this.sides);

		if (sides.length != 3) {
			throw new IllegalArgumentException("Triangle must have 3 sides");
		}
		if (sides[0] <= 0 || sides[1] <= 0 || sides[2] <= 0) {
			throw new IllegalArgumentException("Triangle sides must be greater than zero");
		}
		if (sides[0] + sides[1] <= sides[2]) {
			throw new IllegalArgumentException("Invalid triangle");
		}

	}

	public Triangle(double s1, double s2, double s3) {
		this(new double[] { s1, s2, s3 });
	}

	@Override
	public String toString() {
		return String.format("(%.f2,%.f2,%.f2)", sides[0], sides[1], sides[2]);
	}
	//3 sides are equal
	public boolean isEquilateral() {
		return (sides[0] == sides[1] && sides[1] == sides[2]);
	}
	//2 sides are equal		
	public boolean isIsosceles() {
		return !isEquilateral() && (sides[0]==sides[1] || sides[1]==sides[2] || sides[0]==sides[2]);
	}
	//is right angled a2 = b2 + c2
	 public boolean isRightAngled() {
	        return Math.abs(sides[0]*sides[0] + sides[1]*sides[1] - sides[2]*sides[2]) < 1.e-5;
	  }
	 
	 public List<Double> getSides()
	 {
		 return Arrays.asList(sides[0], sides[1], sides[2]);
		 
	 }
}
