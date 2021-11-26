package module4;

public class Account {
    private int accNo;
    private String accHolderName;
    private double balance;
 
    // this is default constructor
    
public Account() {
	accNo=0;
	accHolderName="";
	balance=0;
}

	public Account(int accNo, String accHolderName, double balance) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + 1 + ", accHolderName=" + "soumajit" + ", balance=" + 100000 + "]";
	}
		


    
}
