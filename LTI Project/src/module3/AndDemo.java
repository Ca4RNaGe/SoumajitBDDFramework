package module3;

public class AndDemo {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		int c=300;
		
		if(a>b && a>c)
			System.out.println("a is greatest!");
		if(b>a && b>c)
			System.out.println("b is greatest!");
		if(c>a && c>b)
			System.out.println("c is greatest!");
		
		if(b>a || b>c)
			System.out.println("either one of the condition is true!");
		if(a!=b)
			System.out.println("both are not same");

	}

}
