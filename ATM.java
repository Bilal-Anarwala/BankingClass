package atmint;

import java.util.Scanner;

public class ATM {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Bank theBank = new Bank("The Bank of The New World");
		
		User aUser = theBank.addUser("Billy", "Bob", "1234");
		
		Account newAccount = new Account("Checking", aUser, theBank);
		
		aUser.addAccount(newAccount);
		theBank.addAccount(newAccount);
		
		User curUser;
		while(true) {
			
			curUser = ATM.mainMenuPrompt(theBank, sc);
			
			//ATM.printUserMenu(curUser, sc);
		}
		
		
	}
	
	public static User mainMenuPrompt(Bank theBank, Scanner s) {
		
		String userID;
		String pin;
		User authUser;
		
		
		do {
			System.out.printf("\n\nWelcome to %s\n\n", theBank.getName());
			System.out.print("Enter user ID: ");
			userID = s.nextLine();
			System.out.printf("Enter pin: ");
			pin = s.nextLine();
			
			
		} while(true);
	}

}
