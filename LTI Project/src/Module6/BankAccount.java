package Module6;

public class BankAccount {
	
    private int accNo;
    private double bal;
    private static int idNum=0;
    
    public BankAccount()
    
    {
    	bal=0.0;
    			accNo=idNum++;
    }
    
    public static int getIdNum()
    
    {
    	return idNum;
    }

	public static void main(String[] args) {
		BankAccount obj=new BankAccount();
		System.out.println(obj.getIdNum());
    
	     

	}

}
