package collectionpack;
import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {
		List<Emp> employees = new ArrayList<Emp>();
		
		
		Emp emp1=new Emp(1, "pr");
		Emp emp2=new Emp(1, "priya");
		Emp emp3=new Emp(1, "priti");
		Emp emp4=new Emp(1, "ram");
		Emp emp5=new Emp(1, "yogesh");
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);

	}

}
