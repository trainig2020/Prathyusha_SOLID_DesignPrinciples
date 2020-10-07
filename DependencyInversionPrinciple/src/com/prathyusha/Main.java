package com.prathyusha;

public class Main {

	public static void main(String[] args) {
		Project p = new Project();
		p.implement(new BackEndDeveloper());
		p.implement(new FrontEndDeveloper());

		Developer d= new BackEndDeveloper(); 
		d.develop();
		Developer d1 = new FrontEndDeveloper(); 
		d1.develop() ;
		 

	}

}
