package inheritance;

public class Student extends Person {
	
	protected int roll;
	protected char grade;
	protected double marks;
	protected String stream;
	
	public Student(String name, char genfer, int age, int roll, char grade, double marks, String stream) {
		super(name, genfer, age);
		this.roll = roll;
		this.grade = grade;
		this.marks = marks;
		this.stream = stream;
		
		
	}

	@Override
	public String toString() {
		return super.toString() + "Student [roll=" + roll + ", grade=" + grade + ", marks=" + marks + ", stream=" + stream + "]";
	}//to call the tosting method of parent class
	
	

}
