package jdbc;
import java.sql.*;

public class UpdateDemo {

	public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");  //loads the driver in the memory
           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
           System.out.println("connection is successful!!!");

           String str1="insert into emp3 values(4,'ketan', 60000)";
           //String str1="delete from emp3 where empno=3";
           //String str1="update emp3 set ename='mohanraj' where empno=3";
           Statement stmt=con.createStatement();
           stmt.executeUpdate(str1);
           con.close();


        }
        catch(Exception e)
        {
            System.out.println(e);
        }


       }

	

	}


