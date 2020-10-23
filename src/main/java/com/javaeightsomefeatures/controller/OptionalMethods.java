package com.javaeightsomefeatures.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * ofNullable(), of()
 *
 */

@RestController
public class OptionalMethods {

	Employee emp1 = new Employee("123", "abc", "backenddev");
	Employee emp2 = new Employee("123", "backenddev");

	/**
	 * When to use-when u r not sure of the data(Certain abt of the data) then use
	 * this,because if no data is present then it return Optional object with no
	 * value(avoids null pointer exception)
	 * 
	 */

	@RequestMapping("/offullable")
	public Optional<String> ofNullable() {

		Optional<String> empOptional = Optional.ofNullable(emp1.getEmpName());
		// Optional<String> empOptional=Optional.ofNullable(emp2.getEmpName());
		return empOptional;

	}

	/**
	 * 
	 * When to use-if your pretty sure of the data u can use, otherwise it will
	 * throw null pointer exception
	 */
	@RequestMapping("/of")
	public Optional<String> of() {
		Optional<String> empOptional = Optional.of(emp1.getEmpName());
		// Optional<String> empOptional=Optional.of(emp2.getEmpName());
		return empOptional;
	}

}
