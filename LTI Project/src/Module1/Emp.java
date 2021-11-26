package Module1;

public class Emp {
    private int empId;  //mv
    private double sal;  //mv

    public void accept() {
        System.out.println("this is accept method");
    }

    public void display() {
        System.out.println("this is display method ..");
    }

    public static void main(String[] args) {
        Emp obj=new Emp();
        obj.accept();
        obj.display();

        System.out.println("============================");
        System.out.println("Creating 2nd obj");
        Emp obj2=new Emp();
        obj2.accept();
        obj2.display();

        System.out.println("============================");
        System.out.println("Creating 3rd obj");
        Emp obj3=new Emp();
        obj3.accept();
        obj3.display();

    }
 
}