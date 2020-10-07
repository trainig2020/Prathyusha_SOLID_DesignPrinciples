package com.prathyusha;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the User :");
		String name = sc.next();
		UserSettingService u = new UserSettingService();
		u.changeEmail(name);
	}

}
