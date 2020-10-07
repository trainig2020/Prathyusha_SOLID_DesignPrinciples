package com.prathyusha;

public class Rectangle {
	
	private double length;
	private double breadth;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	public double getArea() {
		return this.length * this.breadth;
	}
	
	 

}
