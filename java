package yazhu;
import java.util.*;
public class Atm {
	private  int balance;
	private int pin;
	public Atm(int balance,int pin) {
		this.balance=balance;
		this.pin=pin;
	}
	public void display() {
		System.out.println("1.check the balance");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.change pin");
		System.out.println("5.exit");
		
	}
	public void deposit(int amount) {
		balance=+amount;
	}
	public void withdraw(int amount) {
		if(amount>balance) {
			System.out.println("insufficient balance");
			return;
			
		}
		else {
		balance-=amount;
		}
	}
	public int balance() {
		return balance;
		
	}
	public Boolean validatepin(int pin) {
		return this.pin==pin;
		
		
	}
	public void changepin(int newpin) {
		pin=newpin;
		System.out.println("pin changed successfully");
	}
	
	

	public static void main(String[] args) {
		Atm atm=new Atm(1000,107);
		atm.display();
		System.out.println("Enter the pin:");
		Scanner sc= new Scanner(System.in);
		int enteredpin=sc.nextInt();
		if(atm.validatepin(enteredpin)) {
			atm.display();
			int option=0;
			while(option!=5) {
				atm.display();
				System.out.println("enter option:");
				option=sc.nextInt();
				switch(option) { 
					case 1:
						atm.balance();
						break;
					case 2:
						System.out.println("Amount to deposit:");
						int amount=sc.nextInt();
						atm.deposit(amount);
						break;
					case 3:
						System.out.println("Amount to withdraw:");
						amount=sc.nextInt();
						atm.withdraw(amount);
						
						break;
					case 4:
						System.out.println("Enter new pin:");
						int newpin=sc.nextInt();
						atm.changepin(newpin);
						break;
					case 5:
						System.out.println("thankyou!");
						break;
					default:
						break;
					
			
				
				
				}
			}
			
		}
		else {
			System.out.println("Invalid pin");
		}
		
		
		}
		
		
		
		
		

	}
