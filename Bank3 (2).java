import java.util.*;
abstract class Bank //serivice specifier
{
	double bal=0.0;
	public abstract void deposit(double d);
	public abstract void withdraw(double w);
	public abstract void ifsc(String i);
	public abstract void branch(String b);
	public abstract void detailsOfBank();
}
class Icici extends Bank //service provider
{
	// balance is inherited
	@Override
		public void detailsOfBank(){
			System.out.println("BANK NAME : ICICI");
			System.out.println("************************");
		}
	@Override
		public void deposit(double d){
			bal+=d;
			System.out.println("Deposit Succesfully Done");
			System.out.println("Available Balance : "+bal);
		}
	@Override
		public void withdraw(double w){
			if (bal>=w){
				bal-=w;
				System.out.println("Withdraw Succesfully Done");
			    System.out.println("Available Balance : "+bal);
			}
			else{
				System.out.println("Insufficient Balance");
			}
		}
	@Override
		public void ifsc(String i){
			System.out.println(i);
		}
	@Override
		public void branch(String b){
			System.out.println(b);
		}
}
class Sbi extends Bank //service provider
{
	// balance is inherited
	@Override
		public void detailsOfBank(){
			System.out.println("BANK NAME : SBI");
			System.out.println("************************");
		}
	@Override
		public void deposit(double d){
			bal+=d;
			System.out.println("Deposit Succesfully Done");
			System.out.println("Available Balance : "+bal);
		}
	@Override
		public void withdraw(double w){
			if (bal>=w){
				bal-=w;
				System.out.println("Withdraw Succesfully Done");
			    System.out.println("Available Balance : "+bal);
			}
			else{
				System.out.println("Insufficient Balance");
			}
		}
	@Override
		public void ifsc(String i){
			System.out.println(i);
		}
	@Override
		public void branch(String b){
			System.out.println(b);
		}
}
class CityBank extends Bank //service provider
{
	// balance is inherited
	@Override
		public void detailsOfBank(){
			System.out.println("BANK NAME : CITYBANK");
			System.out.println("************************");
		}
	@Override
		public void deposit(double d){
			bal+=d;
			System.out.println("Deposit Succesfully Done");
			System.out.println("Available Balance : "+bal);
		}
	@Override
		public void withdraw(double w){
			if (bal>=w){
				bal-=w;
				System.out.println("Withdraw Succesfully Done");
			    System.out.println("Available Balance : "+bal);
			}
			else{
				System.out.println("Insufficient Balance");
			}
		}
	@Override
		public void ifsc(String i){
			System.out.println(i);
		}
	@Override
		public void branch(String b){
			System.out.println(b);
		}
}
class DriverBank3 //end user 
{
	static Scanner s=new Scanner(System.in);
	static boolean b=true;
	public static void main(String[] args) 
	{
		do{
		System.out.println("Select Your Bank");
		System.out.println(" 1. ICICI\n 2. State Bank Of Indian\n 3. CityBank\n 4. Exit");
		int option=s.nextInt();
		switch(option){
			case 1:{//ICICI
					Bank ref1=new Icici();
					ref1.detailsOfBank();
					ref1.branch("Chennai");
					ref1.ifsc("ICICI0010");
					System.out.println("Initial Balance : "+ref1.bal);
					//deposit
					ref1.deposit(1000);
					System.out.println("*******************************");
					ref1.withdraw(500);
					System.out.println();
					break;
				}
			case 2:{//sbi
					Bank ref2=new Sbi();
					ref2.detailsOfBank();
					ref2.branch("Palakkad");
					ref2.ifsc("SBI00300088");
					System.out.println("Initial Balance : "+ref2.bal);
					//deposit
					ref2.deposit(10000);
					System.out.println("*******************************");
					ref2.withdraw(5500);
					System.out.println();
					break;
				}
			case 3:{//Citybank
					Bank ref3=new CityBank();
					ref3.detailsOfBank();
					ref3.branch("Thrissur");
					ref3.ifsc("CIB00324708");
					System.out.println("Initial Balance : "+ref3.bal);
					//deposit
					ref3.deposit(100000);
					System.out.println("*******************************");
					ref3.withdraw(5500);
					System.out.println();
					break;
				}
			case 4:{//exit
				b=false;
				break;
			}
		}
		}while(b);
	}
}
