# ATM Simulation System
A simple Java console-based ATM application developed using Object-Oriented Programming concepts.

## Features
- PIN Authentication
- Check Account Balance
- Deposit Money
- Withdraw Money
- Change PIN
- Exit from ATM

## Technologies Used
- Java
- OOP Concepts
- Scanner Class
- Eclipse IDE

## Project Files
- BankAccount.java
- ATM.java

## Working Explanation
1. The user enters a PIN to access the ATM.
2. If the PIN is correct, the ATM menu is displayed.
3. Users can:
   - Check account balance.
   - Deposit money into the account.
   - Withdraw money from the account.
   - Change the account PIN after verification.
   - Exit the ATM system.
4. The balance is updated after every transaction.

## Sample Output
*****WELCOME TO OURBANK ATM*****
Please enter your pin:
1234
-----ATM MENU------
1.Check Balance
2.Deposit Money
3. Withdrawl Money
4.Change PIN
5. EXIT
Choose an Option
1
Your balance is :$1000.0
Choose an Option
2
Enter amount to deposit:$
1000
Successfully deposited:$1000.0
Choose an Option
3
Enter amount to withdrawl:$
1500
Transaction Successful
Choose an Option
4
Enter your current PIN to confirm:
1234
Enter new pin
1592
Pin changed successfully
Choose an Option
1
Your balance is :$500.0
Choose an Option
5
Thank you for using ATM

## How the Program Works
---> Check Balance
Displays the current amount available in the account.
---> Deposit Money
Adds the entered amount to the existing balance and confirms the transaction.
--->Withdraw Money
Subtracts the entered amount from the account balance if sufficient funds are available.
--->Change PIN
Verifies the current PIN and allows the user to set a new PIN.
---> Exit
Ends the ATM session safely.

## Author
Sri Pallavi Addanki
