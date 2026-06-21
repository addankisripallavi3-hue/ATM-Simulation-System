import java.util.Scanner;
public class ATM {
	static Scanner sc= new Scanner(System.in);
 public static void main(String[] args) {
	 BankAccount Pallavi =new BankAccount(1000.00,1234);
	 System.out.println("*****WELCOME TO OURBANK ATM*****");
	 System.out.println("Please enter your pin:");
	int enteredPin= sc.nextInt();
	if(!Pallavi.validate(enteredPin)) {
		System.out.println("IncorrectPin");
		sc.close();
		return;
	}
	boolean exit =false;
	while(!exit) {
		System.out.println("\n-----ATM MENU------");
		System.out.println("1.Check Balance");
		System.out.println("2.Deposit Money");
		System.out.println("3. Withdrawl Money");
		System.out.println("4.Change PIN");
		System.out.println(" 5. EXIT");
		
		System.out.println("Choose an Option");
		
	int choice =sc.nextInt();
	switch(choice) {
	    case 1:
		System.out.println("Your balance is :$"+ Pallavi.getBalance());
	       break;
	       case 2:
	    	   System.out.println("Enter amount to deposit:$");
	        double amount=sc.nextDouble();
	        Pallavi.deposit(amount);
	        break;
	        case 3:
	        	System.out.println("Enter amount to withdrawl:$");
	        double amount1=sc.nextDouble();
	        Pallavi.withdraw(amount1);
	        break;
	        case 4:
	        	System.out.println("Enter your current PIN to confirm:");
	        int currentPin =sc.nextInt();
	       if(Pallavi.validate(currentPin)){
	    	   System.out.println("Enter new pin");
	    	   int newPin=sc.nextInt();
	    	   Pallavi.changePin(newPin);
	       }else {
	    	   System.out.println("verification failed,cannot change the pin.");
	       }
	       break;
	       case 5:
	    	   System.out.println("Thank you for using ATM");
	       exit =true;
	       break;
	       default:
	    	   System.out.println("Invalid  option! Please pick a option from 1 to 5");
	}
 }
}
}
