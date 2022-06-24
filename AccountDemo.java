package OOps;

import java.util.Scanner;

class AccountDetails{
	//declaring instance variables 
	private long accNo;
	private String accHolderName;
	private int accBal;
	private String accType;
	
	public AccountDetails( long accountNo ,String AccHolderName,int accBalance,String accType)//Initializing variables with help of method
	{
		this.accNo=accountNo;
		this.accHolderName=AccHolderName;
		this.accBal=accBalance;
		this.accType=accType;
	
}

public void withdraw(int accBalance ) {
	if(this.accBal>accBal) {
		this.accBal=this.accBal-accBalance;
		System.out.println("withdraw succesful...\n current balance is"+this.accBal);
		
	}
	else {
		System.out.println("you dont have sufficient balance");
	}
	}
public void deposit(int accBalance ) {
	this.accBal=this.accBal+accBal;
	System.out.println("desposit succsfull\n your current balance is: "+this.accBal);
}
public void check() {
	
	System.out.println("your balance is: "+this.accBal+" "+"your account number is: "+this.accNo+"\n "
		+"your account type is: "+this.accType);
}
}

	
public class AccountDemo {

	public static void main(String[] args) {
		int ch,a;
		AccountDetails joy =  new AccountDetails (123456,"Joydip Bardhan", 10000, "saving"); //creating object for StudentDetails class
		System.out.println("enter following numbers to do operations\n 1.withdraw\n 2.Deposit\n.3check blance");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		
		switch (ch) {

		  case 1:
			  System.out.println("enter amount you want to withdraw");
			  a=sc.nextInt();
			  joy.withdraw(a);
		
		    break;
		  
		  case 2:
			  System.out.println("enter amount you want to deposit");
			  a=sc.nextInt();
			  joy.deposit(a);
		    break;
		  case 3:
			 
			  joy.check();
		    break;
		  
		  
		  default:
			  System.out.println("Enter a valid choice");
		   
		  } 
	}

}
