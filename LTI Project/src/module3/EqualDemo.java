package module3;

public class EqualDemo {
	 
    public static void main(String[] args) {
        String str1="priti";
        String str2="priya";
// == / .eqauls
        if(str1==str2)
            System.out.println("both are equal");
        else
            System.out.println("both are different !!");

        System.out.println("==============================");

        if(str1.equals("ria"))   //to compare the value
            System.out.println("same !");
        else
            System.out.println("it is diff");

        System.out.println("==============================");
        if(str1.equals(str2))    //to compare the value
            System.out.println("same !");
        else
            System.out.println("it is diff");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
 
}

//hashcode() : returns the integer representation of memory object

