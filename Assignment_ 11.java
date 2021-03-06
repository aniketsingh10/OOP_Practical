/*
Name :- Aniket Singh
Assignment 11 :- Strategy Design Pattern

Problem Statement:-
/*
  Implement and apply Strategy Design pattern for simple Shopping Cart where three payment 
  strategies are used such as Credit Card, PayPal, Bit Coin. Create an interface for strategy pattern 
  and give concrete implementation for payment.
*/

import java.util.Scanner;
//============= INTERFACE PaymentProcessor ==============//
interface PaymentProcessor {
	  void pay(int amount);//interface method pay
}
class CreditCard implements PaymentProcessor {
	  Scanner sc =new Scanner (System.in);//creating object of scanner class
	  String name,ExpDate;
	  double CardNo;
	  CreditCard(){ 
		  super();
		  System.out.println("-------------------------------------");
		  System.out.print("\tCard holder Name :: ");
		  this.name =sc.next();
		  System.out.print("\tCard Number :: ");
		  this.CardNo =sc.nextDouble();
		  System.out.print("\tCard Expire Date :: ");
		  this.ExpDate =sc.next();
		  System.out.println("-------------------------------------");
	  }	  
	  @Override 
	  public void pay(int amount) { 	//method for payment
		  System.out.println("----------------------------------------------------------");
	      System.out.println("Paying through CreditCard payment: Charging $" + amount);
	      System.out.println("----------------------------------------------------------");
	  }
}
class PayPal implements PaymentProcessor {
	//Constructor of PayPal class
	PayPal(){
		super();//calling parent class constructor
		System.out.println("\nChecking Internet Connection........");  
	   }
	@Override
	 public void pay(int amount) { 
		System.out.println("----------------------------------------------------------");
		System.out.println("Paying through PayPal payment: Charging $" + amount);
		System.out.println("----------------------------------------------------------");
	  }
	}
class BitCoin implements PaymentProcessor {
	Scanner sc =new Scanner (System.in);
	String add;
	//Constructor of BitCoin class
	BitCoin(){
		   super();
		   System.out.print("\nEnter Transaction 'Input Address' :: ");
		   add= sc.next();  
	   }
	@Override
	public void pay(int amount) { 
		  System.out.println("----------------------------------------------------------");
		    System.out.println("Paying through BitCoin payment: Charging $" + amount);
		    System.out.println("----------------------------------------------------------");
	  }
}
class Order {
	private final PaymentProcessor paymentProcessor;
	private final int amount;
	public Order(int amount, PaymentProcessor paymentProcessor) {
	     this.amount = amount;
	     this.paymentProcessor = paymentProcessor;
	   }
	public void process() {
	     paymentProcessor.pay(amount);
	   }
}
public class Main {
	//calling static void main method
	public static void main(String[] args) {
		int c,amt=0;
		Order order;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println();
			System.out.println("**** SHOPING CART ****");
			System.out.print("1.Credit Card \n2.PayPal \n3.BitCoin \n4.Exit");
			System.out.print("\n\nEnter the Choice ::");
			c=sc.nextInt();
			System.out.println("-------------------------------------");
			if(c==1||c==2||c==3) {
				 System.out.print("\nEnter amount tobe Tranfer :: ");
				 amt = sc.nextInt();
			 System.out.println("------------------------------------");
			}
			switch(c) {
			 case 1:
				  order = new Order(amt, new CreditCard());
				  order.process();
				 break; 
			 case 2:
				  order = new Order(amt, new PayPal());
				  order.process();
				  break;
			 case 3:
				  order = new Order(amt, new BitCoin());
				  order.process();
				  break;
			 case 4:
				 System.out.println("\nThank you For Shopping !!!! ");
				 System.out.println("----------------------------------------------------------");
				 return;
			default:
				System.out.println("Invalid Payment Mode !!!");
				System.out.println("----------------------------------------------------------");
			 }
		}
	}
} 
/*
------------------ OUTPUT ------------------------------- 

**** SHOPING CART ****
1.Credit Card 
2.PayPal 
3.BitCoin 
4.Exit 
Enter the Choice ::1
----------------------------------------------------------
Enter amount tobe Tranfer :: 350
----------------------------------------------------------
----------------------------------------------------------
	Card holder Name :: Aniket
	Card Number :: 785423695628
	Card Expire Date :: 12/24
----------------------------------------------------------
----------------------------------------------------------
Paying through CreditCard payment: Charging $350
----------------------------------------------------------
**** SHOPING CART ****
1.Credit Card 
2.PayPal 
3.BitCoin 
4.Exit 
Enter the Choice ::2
----------------------------------------------------------
Enter amount tobe Tranfer :: 5000
----------------------------------------------------------
Checking Internet Connection........
----------------------------------------------------------
Paying through PayPal payment: Charging $5000
----------------------------------------------------------
**** SHOPING CART ****
1.Credit Card 
2.PayPal 
3.BitCoin 
4.Exit 
Enter the Choice ::3
----------------------------------------------------------
Enter amount tobe Tranfer :: 10000
----------------------------------------------------------
Enter Transaction 'Input Address' :: 5342.9324.2671.1354
----------------------------------------------------------
Paying through BitCoin payment: Charging $10000
----------------------------------------------------------
**** SHOPING CART ****
1.Credit Card 
2.PayPal 
3.BitCoin 
4.Exit 
Enter the Choice ::5
----------------------------------------------------------
Invalid Payment Mode !!!
----------------------------------------------------------
**** SHOPING CART ****
1.Credit Card 
2.PayPal 
3.BitCoin 
4.Exit 
Enter the Choice ::4
----------------------------------------------------------
Thank you For Shopping !!!! 
----------------------------------------------------------
*/
