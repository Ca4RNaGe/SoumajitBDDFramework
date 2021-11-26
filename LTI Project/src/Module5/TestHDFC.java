package Module5;
import java.util.Scanner;

public class TestHDFC {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		HDFC hdfc=new HDFC();
		System.out.println(hdfc);
		
		hdfc.setAccNumber(1);
		hdfc.setAccHolderName("Soumajit");
		hdfc.setAccBalance(1000000);
		
		System.out.println(hdfc);
		
		System.out.println("==================");
		System.out.println("changing the account name");
		hdfc.setAccHolderName("Souma");
		System.out.println(hdfc);
		
		System.out.println("===========================");
		System.out.println("the account number "+ hdfc.getAccNumber());
		System.out.println("the account number "+ hdfc.getAccHolderName());
		System.out.println("the account number "+ hdfc.getAccBalance());
		
		System.out.println("=========================");
		System.out.println("Callling withdraw method");
		
		System.out.println("enter the value");
		double amt=sc.nextDouble();
        hdfc.withdraw(amt);
        System.out.println(hdfc);
        
		System.out.println("=========================");
		System.out.println("Callling deposit method");
		
		System.out.println("enter the value");
		double amt2=sc.nextDouble();
        hdfc.deposit(amt2);
        System.out.println("Account balance is "+ hdfc.getAccBalance());
        
	}

}
