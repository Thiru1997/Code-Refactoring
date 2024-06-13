public class ATMAccessBad { 
	
	private String state; 
  
	public final static String CARD_ENTERED = "CARD ENTERED"; 
	public final static String VALID_CARD = "VALID CARD"; 
	public final static String VALID_PIN = "VALID PIN"; 
	public final static String VALID_CASH_REQUEST = "VALID CASH REQUEST";  
	public final static String DENIED = "DENIED";
	
	public final static int CARD_NUMBER = 9080606609;
	public final static int PIN_NUMBER = 1997;
	public final static double CARD_BALANCE = 5000.00;
	
	public ATMAccessBad() { state = CARD_ENTERED; }  
	
	public void verifyCard(int cardNumber) { 
		
		if (CARD_NUMBER == cardNumber) { 
			state = VALID_CARD; 
		} else state = DENIED; 
		
	}  

	public void verifyPIN(int pinNumber) { 
		
		if (PIN_NUMBER == pinNumber) { 
			state = VALID_PIN; 
		} else state = DENIED; 
		
	} 
	
	public void verifyWithdrawalAmount(double withdrawalRequest) { 
		
		if (CARD_BALANCE > withdrawalRequest) { 
			state = VALID_CASH_REQUEST; 
		} else state = DENIED; 
		
	}  

	public static void main(String[] args){
		
		ATMAccessBad user = new ATMAccessBad();
		
		System.out.println(user.state);
		
		user.verifyCard(9080606609);
		
		System.out.println(user.state);
		
		user.verifyPIN(2997);
		
		System.out.println(user.state);
		
		user.verifyWithdrawalAmount(1000);
		
		System.out.println(user.state);
		
	}

}
