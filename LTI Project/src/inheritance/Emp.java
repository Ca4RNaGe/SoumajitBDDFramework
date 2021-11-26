package inheritance;

public class Emp extends Student {
	
	protected int empId;
	protected String company;
	protected String drsg;
	protected double sal;
	
	public Emp(String name, char genfer, int age, int roll, char grade, double marks, String stream, int empId,
			String company, String drsg, double sal) {
		super(name, genfer, age, roll, grade, marks, stream);
		this.empId = empId;
		this.company = company;
		this.drsg = drsg;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", company=" + company + ", drsg=" + drsg + ", sal=" + sal + ", roll=" + roll
				+ ", grade=" + grade + ", marks=" + marks + ", stream=" + stream + ", name=" + name + ", genfer="
				+ genfer + ", age=" + age + "]";
	}

	

	
}
