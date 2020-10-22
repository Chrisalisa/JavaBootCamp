package sef.module6.activity;

public class Rectangle extends Shape{
	private double length;
	private double width;

	public Rectangle() {
		this.length=0;
		this.width=0;
	}
	public Rectangle(double x, double y) {
		this.length=x;
		this.width=y;
	}
	
	public double calculateArea() {
		return this.length*this.width;
	}

	
	public double calculatePerimeter() {
		return 2*(this.length+this.width);
	}
}

