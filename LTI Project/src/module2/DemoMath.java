package module2;

public class DemoMath {
	
	public static void main(String[] args) {
		//to generate random number
		double d=(Math.random() )*10;
		System.out.println("d is "+d);
		
		int i=(int)(Math.random()* 100);
		System.out.println("i is "+i);
		
		System.out.println(Math.sqrt(144));
		/*
		 * Math.pow()
		 * math.abs(-100)  :return the positive number
		 * Math.min()
		 * Math.min()
		 * Math.ceil()
		 * Math.floor()
		 * Math.round()
		 */
		int j=(int)(Math.pow(3,4));
		System.out.println("j i "+j);
	}

}
