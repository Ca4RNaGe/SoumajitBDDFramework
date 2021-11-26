package exceptionpack;

public class MultiException {
    public static int divide(int a, int b)     {
        return (a/b);  
        }

    public static void main(String[] args) {
          String  num1="100";
          String  num2="abc";  //0  abc
            int result;

            try { 
              int a1=Integer.parseInt(num1);
              int b1=Integer.parseInt(num2);
                result=divide(a1, b1);
                System.out.println("the result is " + result);
            }
            catch(ArithmeticException e)   // 100 /0
            {    
                System.out.println(e.getMessage());
            } 
            catch(NumberFormatException e1)
            {
                System.out.println("second ex");
                System.out.println("the expected input is a number and not a character !!!");
                System.out.println(e1.getMessage());
            }
            catch(Exception e2)  //if there is no matching exec then this exec will be raised 
            {
                System.out.println(e2.getMessage());
            }
            finally
            {
                System.out.println("this is my finally !!!");
            }
            }


}

