package com.prathyusha;

public class Main {
	
	public static void main(String[] args) {
		
		LoginMessengerUser l=new LoginMessengerUser();
		  l.askForCard();
		  l.tellInvalidCard();
		  l.askForPin();
		  l.tellInvalidPin();
		
		  
		 WithdrawalMessengerUser w=new WithdrawalMessengerUser();
		 w.tellNotEnoughMoneyInAccount();
	}
	
	

}
