package com.prathyusha;

public class UserSettingService {
	
	public void changeEmail(String user) { 
	
		if (SecurityService.checkAccess(user)) {
             System.out.println("Authorized User"); 
		}
		else {
			System.out.println("Access Denied");
		}

	}
}
