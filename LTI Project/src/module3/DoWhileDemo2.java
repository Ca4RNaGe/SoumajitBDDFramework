package module3;
import java.util.Scanner;

public class DoWhileDemo2 {
	 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int ch;
        String choice;

        do {
        System.out.println("ICICI Bank");
        System.out.println("1. Accept details ");
        System.out.println("2. Display details ");
        System.out.println("3. Withdraw amount");
        System.out.println("4. Deposit amount");
        System.out.println("5. Check Balance");
        System.out.println("6. Tranfer amount");
        System.out.println("7. Exit");
        System.out.println("Enter your choice");

        ch=sc.nextInt();

        switch (ch)
        {
        case 1 :
            System.out.println("Accepting the  details ");
            break;
        case 2 :
            System.out.println("Displaying the  details ");
            break;
        case 3 :
            System.out.println("Calling the withdraw method ");
            break;
        case 4 :
            System.out.println("Calling the deposit method ");
            break;
        case 5 :
            System.out.println("Check the balance");
            break;
        case 6 :
            System.out.println("Calling the transfer method  ");
            break;
        case 7 :
            System.exit(0);
            break;
        default :
            System.out.println("invalid input");
            break;

        }

          System.out.println("Do you want to continue (Y/ N)?");
            choice=sc.next();
        }while(choice.equals("Y") || choice.equals("y"));



    }
 
}
