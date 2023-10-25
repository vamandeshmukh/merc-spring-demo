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

		System.out.println("End");

	}
}
