package com.prathyusha;

public class Main {
	

	public void calculateArea(Rectangle r)
	{
	r.setBreadth(5);
	r.setLength(5);
	System.out.println(r.getArea());
	
	}
	
	public static void main(String[] args)
	{
	Main m = new Main();
	// An instance of Rectangle is passed
	System.out.println("Rectangle : ");
	m.calculateArea(new Rectangle());
	// An instance of Square is passed
	System.out.println("Square : ");
	m.calculateArea(new Square());
	}
	
	
	

	
	
}
