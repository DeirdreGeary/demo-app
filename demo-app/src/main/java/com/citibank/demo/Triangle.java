package com.citibank.demo;

import java.util.Arrays;

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

}
