package org.info.test;

public class Employee {
	private void empId() {
		System.out.println("Employee id is 200");
	}
		private void empName() {
	   System.out.println("Employee name is arun");
	   System.out.println("Employee Weight is 100kgs");
		}
	   private void empAge() {
		   System.out.println("Employee age is 25");
	   }
	   public static void main(String[] args) {
		Employee i = new Employee();
		i.empId();
		i.empName();
		i.empAge();
	   }
	}
    	   
       