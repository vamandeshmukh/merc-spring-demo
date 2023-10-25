package com.merc.demo;

import com.merc.demo.models.Employee;

/**
 * 
 * @author Vaman Deshmukh
 *
 */

public class App {

	public static void main(String[] args) {

		System.out.println("Start");

		Employee emp = new Employee(101, "Sonu", 90000d);
		System.out.println(emp.toString());
		Employee emp2 = new Employee(101, "Sonu", 90000d);
		System.out.println(emp2.toString());
		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());

		System.out.println("End");

	}
}

// bean == object == instance 
















