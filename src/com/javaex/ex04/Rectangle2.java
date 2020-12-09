package com.javaex.ex04;

public class Rectangle2 extends Shape implements Resizeable {
	
	
	private double height;
	private double width;
	
	
	public Rectangle2(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	
	
	
	@Override
	public double getArea() {
		
		return height*width;
	}

	@Override
	public double getPerimeter() {
		
		return (height*2) + (width*2);
	}

	@Override
	public void resize(double s) {
		 height = height*s;
		 width = width*s;
	}
	
	
	
}