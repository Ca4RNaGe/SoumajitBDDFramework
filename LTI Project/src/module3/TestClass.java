package module3;
import pack1.Emp;

public class TestClass {
	
	public static void main(String[] args) {
		Emp emp=new Emp();
		System.out.println("calling the methods of emp class");
		
		emp.accept();
		emp.display();
		
		System.out.println("===========================================");
		
		System.out.println("creating an object");
		User user=new User();
		user.accept();
		user.checkAge();
		user.checksal();
		user.display();
	}

}
