package stringdemo;

public class Stringclass {
	
	public static void main(String[] args) {
		String a="Priti";
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		String a1="       Uma";
		System.out.println(a1.trim());
		System.out.println(a.replace("i", "ee"));
		System.out.println(a.charAt(2));
		System.out.println(a.concat("Dalvi"));
		System.out.println(a.contains("ti"));
		System.out.println(a.indexOf('i'));
	}

}
