package com.javaex.ex04;

public class RectTriangle2 extends Shape {
	
	private double height;
	private double baseLine;
	
	
	RectTriangle2(double baseLine, double height){
		this.baseLine = baseLine;
		this.height = height;
	}
	
	
	
	@Override
	public double getArea() {
		
		return (height*baseLine)/2;
	}

	@Override
	public double getPerimeter() {
		
		return height + baseLine + Math.sqrt(Math.pow(height, 2)+Math.pow(baseLine, 2));
	}

	
}