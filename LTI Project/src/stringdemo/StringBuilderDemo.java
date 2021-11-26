package stringdemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("Welcome");
		s1.append("Priti");
		System.out.println(s1);
		
		System.out.println(s1.insert(1, "dy"));
		System.out.println(s1);
		
		StringBuilder s2=new StringBuilder("Soumajit");
		s2.replace(4, 8, "uuuu");
		System.out.println(s2);

	}

}
