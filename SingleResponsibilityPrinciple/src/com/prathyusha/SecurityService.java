package com.prathyusha;

public class SecurityService {
	
	public static boolean checkAccess(String user)
	{ 
	
	System.out.println("User is :" + user);
	String name ="prathyusha";
	
	if ( user.equalsIgnoreCase(name)) {
		
		return true;
	}
	else {
		return false;
	}
	

}

}