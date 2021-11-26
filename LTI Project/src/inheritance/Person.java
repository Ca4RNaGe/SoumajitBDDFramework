package inheritance;

public class Person {
	protected String name;
	protected char genfer;
	protected int age;
	
	
	public Person(String name, char genfer, int age) {
		super();
		this.name = name;
		this.genfer = genfer;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", genfer=" + genfer + ", age=" + age + "]";
	}
	
	public void fun1()
	{
		System.out.println("this fun1 function from Parent class");
	}
	
	//const,toasting,fun 1
	

}
