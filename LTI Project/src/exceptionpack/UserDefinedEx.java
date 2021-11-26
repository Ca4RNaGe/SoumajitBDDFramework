package exceptionpack;
import java.util.Scanner;

class PasswordException extends Exception{     //1
	public PasswordException(String s)         //2
	{
		super(s);    //calling the parent class constructor
	}
}

public class UserDefinedEx {
	

	public static void main(String[] args) {
		// accecpt password from user if length <5 throw and exception
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the password");
		String password=sc.next();
		try {
			if(password.length()<5)
			{
				throw new PasswordException("Password should be more than 5 chars");
				
			}
			else
				System.out.println("Valid password");
			}
catch (Exception e)
		{
	System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("this is finally block");
		}
		
	}

}
