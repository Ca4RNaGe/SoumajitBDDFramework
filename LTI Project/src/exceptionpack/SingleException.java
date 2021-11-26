package exceptionpack;

public class SingleException {

    public static int divide(int a, int b) 
    {
        return (a/b);  //100/10        : 10
    }

    public static void main(String[] args) {
          int num1=100;
            int num2=10;
            int result;

            try {  //code may result to an error
                //if there is no error in try , then catch is not executed 
                result=divide(num1, num2);
                System.out.println("the result is " + result);
            }
            catch(ArithmeticException e) 
            {
//                System.out.println("can not divide by 0");
//                System.out.println(e);
//                System.out.println(e.getMessage());
                e.printStackTrace();  //shows the line number and teh function name   
            } 
            finally
            {
                System.out.println("this is my finally !!!");
            }
            }

 
}
