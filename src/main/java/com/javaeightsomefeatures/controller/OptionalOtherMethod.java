package com.javaeightsomefeatures.controller;

import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * orElse,orElseGet,orElseThrow()
 *
 */

public class OptionalOtherMethod {

	Employee emp1 = new Employee("123", "abc", "backenddev");
	Employee emp2 = new Employee("123", "backenddev");

	/**
	 * if input is null then it will display the default value
	 * 
	 * 
	 */

	@RequestMapping("/orElse")
	public String orElse() {

		Optional<Employee> empOptional = Optional.ofNullable(emp1);
		// Optional<Employee> empOptional = Optional.ofNullable(emp2);
		return empOptional.map(Employee::getEmpName).orElse("defaultname");// takes the string
	}

	/**
	 * Difference between orElse,orElseGet-->orElse accepts string
	 * orElseGet-->accepts supplier
	 * 
	 */

	@RequestMapping("/orElseGet")
	public String orElseGet() {
		Optional<Employee> empOptional = Optional.ofNullable(emp1);
		// Optional<Employee> empOptional = Optional.ofNullable(emp2);
		return empOptional.map(Employee::getEmpName).orElseGet(() -> "defaultname");// takes the supplier
	}

	/**
	 * orElseThrow-if data is not found it will throw an exception
	 * 
	 */

	@RequestMapping("/orElseThrow")
	public String orElseThrow() {

		Optional<Employee> empOptional = Optional.ofNullable(emp1);
		// Optional<Employee> empOptional = Optional.ofNullable(emp2);
		return empOptional.map(Employee::getEmpName).orElseThrow(() -> new RuntimeException("no data"));// takes the
																										// supplier
	}

}
