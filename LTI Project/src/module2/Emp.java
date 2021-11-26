package module2;
import java.util.Scanner;

public class Emp {
	
	
    private int empId;  
    private double sal; 
    private String empName;

	Scanner sc=new Scanner(System.in);
	
	public void accept()
	{
		System.out.println("enter the empID");
		empId=sc.nextInt();
		
		System.out.println("enter the sal");
		sal=sc.nextDouble();
		
		System.out.println("enter the empName");
		empName=sc.next();
	}

	public void display() {
		System.out.println(" empId is "+ empId + " sal is "+ sal +" empName is " + empName);
	}
	public static void main(String[] args) {
    Emp Emp=new Emp();
    Emp.accept();
    Emp.display();
	
}
}