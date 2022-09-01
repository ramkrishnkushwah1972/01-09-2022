package com.opps.pll;

import com.opps.bll.Employee;

public class TestEmployee {
	public static void main(String[] args) {
	      
		  Employee e= new Employee();
	      Employee e1 = new Employee(100, "Ravi", "Kushwah", 2000);
	      System.out.println(e1);  // toString();

	      // Test Setters and Getters
	      e1.setSalary(1000);
	      System.out.println(e1);  // toString();
	      System.out.println("id is: " + e1.getID());
	      System.out.println("firstname is: " + e1.getFirstName());
	      System.out.println("lastname is: " + e1.getLastName());
	      System.out.println("salary is: " + e1.getSalary());

	      System.out.println("name is: " + e1.getName());
	      System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

	      // Test raiseSalary()
	      System.out.println(e1.raiseSalary(10));
	      System.out.println(e1);
}
}
