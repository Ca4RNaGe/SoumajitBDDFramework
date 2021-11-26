package Module6;

public class StaticVarDemo {
	private static int num1=1;
	
	public void display()
	{
		System.out.println("num1 is "+ num1);
		num1++;
	}
	public static void main(String[] args) {
		StaticVarDemo obj=new StaticVarDemo();
		obj.display();
		
		StaticVarDemo obj2=new StaticVarDemo();
		obj2.display();
		
		StaticVarDemo obj3=new StaticVarDemo();
		obj3.display();
	}

}
