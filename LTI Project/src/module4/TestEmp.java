package module4;

public class TestEmp {

	public static void main(String[] args) {
		Emp emp1=new Emp();      //will call default constructor
		System.out.println(emp1);  //will call tostring
		
		System.out.println("=================================");
		System.out.println("Object with parameter"); //will call para const
		Emp emp2=new Emp(1,"Souma",98000);  //will call tostring
		emp2.toString();
		System.out.println(emp2);
		

	}

}
