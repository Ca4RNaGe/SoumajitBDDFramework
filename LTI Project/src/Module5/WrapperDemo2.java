package Module5;

public class WrapperDemo2 {

	public static void main(String[] args) {
		int a=100;
		Integer obj=a;  //primitive datatype is converted to obj : boxing
		System.out.println(obj.hashCode());
		
		double d=5646.546;
		Double obj2=d;
		System.out.println(obj2.hashCode());

	}

} 
