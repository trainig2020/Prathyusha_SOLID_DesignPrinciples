package com.prathyusha;

public class Square extends Rectangle {
	
	public void setLength(int length) {
		super.setLength(length);
		super.setBreadth(length);
	}

	
	public void setBreadth(int breadth) {
		super.setBreadth(breadth);
		super.setLength(breadth);
	}

	
}
