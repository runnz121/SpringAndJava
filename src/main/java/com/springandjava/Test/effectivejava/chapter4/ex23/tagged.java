package com.springandjava.Test.effectivejava.chapter4.ex23;

import org.hibernate.AssertionFailure;

public class tagged {
	enum Shape { RECTANGLE, CIRCLE}

	final Shape shape;

	double length;
	double width;

	double radius;

	tagged(double radius) {
		shape = Shape.CIRCLE;
		this.radius = radius;
	}

	tagged(double length, double width){
		shape = Shape.RECTANGLE;
		this.length = length;
		this.width = width;
	}

	double area() {
		switch(shape){
			case RECTANGLE:
				return length * width;
			case CIRCLE:
				return Math.PI * (radius * radius);
			default:
				throw new AssertionError(shape);
		}
	}
}
