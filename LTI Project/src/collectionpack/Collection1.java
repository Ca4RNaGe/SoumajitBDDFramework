package collectionpack;
import java.util.*;

public class Collection1 {

		 
	    public static void main(String[] args) {
	        List employees = new ArrayList();
	        // p child
	        employees.add("Arka"); // st
	        employees.add("dhya"); // st
	        employees.add(20); // in
	        employees.add(8989.66f); // f
	        employees.add(87.44); // d
	 
	        // to display
	        for (int i = 0; i < employees.size(); i++) {
	            System.out.println(employees.get(i));
	        }
	 
	        System.out.println("==============================");
	        // 2nd method
	        Iterator itr = employees.iterator(); // returns teh iterator object
	 
	        while (itr.hasNext()) // return : true false
	        {
	            System.out.println(itr.next()); // return the next value
	        }
	 
	        employees.add("sudeepa");
	        // employees.remove("sudeepa");
	 
	        System.out.println("==========================");
	        System.out.println("added new ele ");
	        for (int i = 0; i < employees.size(); i++) {
	            System.out.println(employees.get(i));
	        }
	 
	        System.out.println("=s==========================");
	        System.out.println("index is " + employees.indexOf("sudeepa"));
	        System.out.println(employees.contains("sudeepa"));
	 
	        employees.isEmpty();
	 
	        employees.remove(2); // 3rd ele will be removed
	        employees.clear(); // clear all ele
	 
	        employees.isEmpty(); // true or false
	        //4.30  pm 
	    }}

	    
	 
	
