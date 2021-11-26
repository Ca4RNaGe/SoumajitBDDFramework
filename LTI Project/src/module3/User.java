package module3;
import java.util.Scanner;

public class User {
	private String userName;
    private int userAge;
    private double salary;
    
    Scanner sc=new Scanner(System.in);

    public void accept()
    {
    	System.out.println("enter name,age,salary");
    	userName=sc.next();
    	userAge=sc.nextInt();
    	salary=sc.nextDouble();
    }
    public void display()
    {
    	System.out.println("the name is "+userName);
    	System.out.println("the age is "+userAge);
    	System.out.println("salary is"+salary);
    }
    public void checkAge()
    {
    	if(userAge < 0)
    		System.out.println("age can not be negative");
    	else if(userAge > 100)
    		System.out.println("age is invalid");
    	else if(userAge>18 && userAge<100)
    		System.out.println("you are eligible");
    }
    public void checksal()
    {
    	if(salary > 0 && salary<200000)
    		System.out.println("valid salary");
    	else
    		System.out.println("invalid salary");
    }
}
