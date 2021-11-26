package module2;

import java.util.Scanner;

public class Circle {
	private int radius;
	private double area1;
	private double peri;

	final double PI=3.14;
	Scanner sc = new Scanner(System.in);
	
	public void accept() {
		System.out.println("enter the radius");
		radius = sc.nextInt();		
	}

	public void display()
	{System.out.println("the radius is "+radius);
	System.out.println("the area is "+area1);
	System.out.println("perimeter is "+peri);
	}
	public void calArea() 
	{
		area1=PI*radius*radius;
	}
	public void calPeri() {
		peri = 2*PI*radius;
	}


}
