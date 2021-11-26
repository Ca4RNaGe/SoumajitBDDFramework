package module2;
import java.util.Scanner;

public class student1 {
	private int rollNo;
	private String name;
	private double score;
	
	Scanner sc=new Scanner(System.in);
	
	public void accept()
	{
		System.out.println("enter the rollno");
		rollNo=sc.nextInt();
		
		System.out.println("enter the name");
		name=sc.next();
		
		System.out.println("enter the score");
		score=sc.nextDouble();
	}

	public void display() {
		System.out.println("rollno is "+rollNo + "name is "+name +"score is"+score);
	}
}
