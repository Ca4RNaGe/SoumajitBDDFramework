package Module1;

public class Hello {

	public static void main(String[] args) {
		System.out.print("Soumajit");
		Class2 obj=new Class2();
		obj.fun1();
		
		Class3 obj=new Class3();
		obj.fun2();
		}
}

class Class2{
	public void fun1()
	{
		System.out.println("this is fun1");
	}
}
class Class3{
	public void fun2()
	{
		System.out.println("this is fun2");
	}
}
