package com.merc.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

		Employee emp0 = new Employee(101, "Sonu", 90000d);
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp.toString());
//		Employee emp2 = context.getBean(Employee.class);
//		System.out.println(emp2.toString());
//		emp.setFirstName("Sonu");
//		System.out.println(emp.toString());
//		System.out.println(emp2.toString());
//		emp2.setSalary(90000d);
//		System.out.println(emp.toString());
//		System.out.println(emp2.toString());
//		System.out.println("End");

		((AbstractApplicationContext) context).close();

	}
}

// bean == object == instance 
// spring config - 3 types 

// XML configuration - 

//Sample - 
//https://docs.spring.io/spring-framework/docs/4.2.x/spring-framework-reference/html/xsd-configuration.html
