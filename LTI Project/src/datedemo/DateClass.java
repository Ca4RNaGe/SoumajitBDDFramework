package datedemo;
import java.time.*;
import java.util.*;

public class DateClass {

	public static void main(String[] args) {
		
//		Date d=new Date();
//		System.out.println(d.toString());
	LocalDateTime t1=LocalDateTime.now();
	System.out.println(t1); //date and time
	
	//display month,date,yr,sec
	LocalDate date1=t1.toLocalDate();
	System.out.println(date1);
	
	System.out.println("month "+t1.getMonth());
	System.out.println("sec "+t1.getSecond());
	System.out.println("min "+t1.getMinute());

	}

}
