package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 

public class GetEmployees {
 
    public static void main(String[] args) {
     try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
        System.out.println("connection is successful!!!");

        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from emp3");   

        while(rs.next())
        {
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getInt(3));
        }
        rs.close();

     }
     catch(Exception e)
     {
         System.out.println(e);
     }

 
    }
 
}

