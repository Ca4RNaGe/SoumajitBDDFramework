package stringdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("Soumajit");
		
		str.append("java");
		System.out.println(str);
		
		System.out.println(str.indexOf("S"));
		
		str.insert(0, "LTI");
		System.out.println(str);

	}

}
