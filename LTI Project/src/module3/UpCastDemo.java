package module3;

public class UpCastDemo {

	public static void main(String[] args) {
		int a=10;
		double d=88.99;
		
		d=a;  //upcasting / implicit conversion
		System.out.println("d is "+d);

		double d1=8989.98; //downcasting/ explicit conversion
				int k=(int) d1;
				 System.out.println(k);
	}

}
