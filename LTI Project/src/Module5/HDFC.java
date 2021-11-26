package Module5;
import java.util.Scanner;
public class HDFC {
    private int accNumber;
    private String accHolderName;
    private double accBalance;
    
    Scanner sc=new Scanner(System.in);
    
    public HDFC() {
		accNumber=0;
		accHolderName="";
		accBalance=0.0;
	}

	public HDFC(int accNumber, String accHolderName, double accBalance) {
		super();
		this.accNumber = accNumber;
		this.accHolderName = accHolderName;
		this.accBalance = accBalance;
	}
	 
	

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	public void withdraw(double amount)
	{
		if(amount>0 && amount<=accBalance)
		{
			accBalance=accBalance-amount;
			System.out.println("withdraw is successful");
		}
		else
			System.out.println("Error");
		}
	public void deposit(double amount)
	{
		if(amount>0)
		{
			accBalance=accBalance+amount;
			System.out.println("deposit is successful");
		}
		else
			System.out.println("Error amount cannot be negative");
	}
	
	@Override
	public String toString() {
		return "HDFC [accNumber=" + accNumber + ", accHolderName=" + accHolderName + ", accBalance=" + accBalance + "]";
	}
    
    

}
