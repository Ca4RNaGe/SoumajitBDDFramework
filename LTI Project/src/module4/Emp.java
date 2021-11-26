package module4;

public class Emp {
    private int empId;
    private String ename;
    private double sal;

public Emp() {
	empId=0;
	ename="";
	sal=0.0;
	
}

public Emp(int empId, String ename, double sal) {
	super();
	this.empId = empId;
	this.ename = ename;
	this.sal = sal;
}

@Override
public String toString() {
	return "Emp [empId=" + empId + ", ename=" + ename + ", sal=" + sal + "]";
}


}
