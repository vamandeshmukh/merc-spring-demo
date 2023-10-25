package com.merc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.merc.demo.models.Employee;

/**
 * 
 * @author Vaman Deshmukh
 *
 */

public class App {

	public static void main(String[] args) {

		System.out.println("Start");

//		Employee emp = new Employee(101, "Sonu", 90000d);
//		System.out.println(emp.toString());
//		Employee emp2 = new Employee(101, "Sonu", 90000d);
//		System.out.println(emp2.toString());

		ApplicationContext context = new ClassPathXmlApplicationContext();

		Employee emp = context.getBean(Employee.class);

		System.out.println(emp.toString());

		System.out.println("End");

	}
}

// bean == object == instance 
// spring config - 3 types 









