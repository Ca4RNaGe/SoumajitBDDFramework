package collectionpack;

public class Emp {
	private int empno;
	private String enmae;
	public Emp(int empno, String enmae) {
		super();
		this.empno = empno;
		this.enmae = enmae;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", enmae=" + enmae + "]";
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEnmae() {
		return enmae;
	}
	public void setEnmae(String enmae) {
		this.enmae = enmae;
	}
	
	

}
