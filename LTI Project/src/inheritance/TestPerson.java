package inheritance;

public class TestPerson {

	public static void main(String[] args) {
	 Person person=new Person("soumajit",'M',23);
	 person.fun1();
	 System.out.println(person);
	 
	 System.out.println("============================");
	 
	 Student souma=new Student("soumajit", 'M', 23, 1, 'A', 98, "Civil");
	 System.out.println(souma);

	 Emp emp=new Emp("soumajit", 'M', 23, 1, 'a', 98, "Civil", 2069, "LTI", "Trainee", 80000);
	 System.out.println(emp);
	}

}
