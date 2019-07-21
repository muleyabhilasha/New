package com.Constructor;

import java.util.Scanner;

public class Account 
{
   
	 double balance;
	
	 double amt;
	
	 double acc_no;
	
	 String name;
	
	 Scanner sc=new Scanner(System.in);
	
	void input()
	{
		
       System.out.println("Enter Account holder name");
		
		name=sc.next();
		
        System.out.println("Enetr Account number");
		
		acc_no=sc.nextDouble();
		
		System.out.println("Enter balance........>");
		
		 balance =sc.nextDouble();
		
		
	}
	
	void display()
	{
		
		System.out.println("***********Employee Details**********"+"\n"+"Name :"+name
				+"\n"+"Account number"+acc_no+"\n"+"Balance"+balance);
		
	}
	
	double deposite()
	{
		
		System.out.println("Enter amount to deposite........");
		
		amt=sc.nextDouble();
		
		double b=balance+amt;
		
		return b;
		
		
	}
	
	void withdraw() 
	{
       
		System.out.println("Enter amount to withdraw........");
		
		amt=sc.nextDouble();
	   
	  
	   if(balance<amt)
		{
			System.out.println("Insufficient balance");
		}
		
		else
		{
			double w= balance-amt;
			
			System.out.println("Total Balance is......"+w);
		}
	
	}
	
	void check_balance()
	{
		
		System.out.println("Balance is......."+this.balance);
	}
	
	public static void main(String[] args)
	
	{
		Account obj=new Account();
		
		 Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("Enetr your choice......>"+"\n"+"1)For Deposit"+"\n"+"2)For Withdrawl"+"\n"+
					"3)Exit");
			
			int ch= sc.nextInt();
			
		switch(ch)
		{
			case 1:
				
				obj.input();
				
				obj.display();
				
				System.out.println("After deposite total amount is......."+obj.deposite());
				
			    break;
			    
			case 2:
				
                obj.input();
				
				obj.display();
				
				obj.withdraw();
				
				break;
				
			case 3:
		    	 
			       System.exit(0);
			       break;		
				
			default:
				
				System.out.println("Invalid choice");
		}
		
		
		}
		
		while(true);
		
	}

}
