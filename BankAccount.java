public class BankAccount {

		   private double balance;
		    private int pin;
		    public double getBalance(){
		        return balance;
		    }
		    public void setBalance(double balance){
		        this.balance=balance;
		    }
		    public int getPin(){
		        return pin;
		    }
		    public void setPin(int pin){
		        this.pin=pin;
		    }
		    public BankAccount(double balance,int pin){
		        super();
		        if(balance >=1000.00) {
		        this.balance=balance;
		        }
		        this.pin=pin;
		    }
	
	public void  deposit(double amount ) {
		if(amount > 0) {
			balance+=amount;
			System.out.println("Successfully deposited:$"+ amount);
			}else {
				System.out.println("Invalid deposit amount");
			}
	}
	public void withdraw(double amount) {
		if(amount<=0) {
			System.out.println("Invalid withdraw amount ");
		}
		if(amount>balance) {
			System.out.println("Transaction failed: Insufficient balance");
		}
		if(amount<=balance) {
		balance-=amount;
		}
		System.out.println("Transaction Successful");
	}
	public boolean validate(int enteredpin) {
		return this.pin== enteredpin;
	}
	public void changePin(int newPin) {
		this.pin=newPin;
		System.out.println("Pin changed successfully");
	}
	
}
