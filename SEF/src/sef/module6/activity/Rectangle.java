package sef.module6.activity;

public class Rectangle extends Shape{
	private double length;
	private double width;

	Rectangle() {
		this.length=0;
		this.width=0;
	}
	public Rectangle(double x, double y) {
		this.length=x;
		this.width=y;
	}
	
	public double calculateArea() {
		return length*width;
	}

	
	public double calculatePerimeter() {
		return 2*(length+width);
	}
}

