package com.javaeightsomefeatures.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 1.Represents a Non-null Value
 * 2.Avoids Nullpointer Exceptions and unnecessary null checks
 * 
 *
 */

@RestController
public class JavaEightOptionalExample {

	Employee emp1 = new Employee("123", "backenddev");

	@RequestMapping("/withoutnullcheck")
	public void exampleWithOutNullCheck() {
		String name = emp1.getEmpName();
		System.out.println(name.length());
	}

	@RequestMapping("/withnullcheck")
	public void exampleWithNullCheck() {
		String name = emp1.getEmpName();
		if (name != null)
			System.out.println(name.length());
		else
			System.out.println("no data");
	}

	@RequestMapping("/withoptional")
	public void exampleWithOptional() {
		Optional<String> empOptional = Optional.ofNullable(emp1.getEmpName());// if data not present-returns
																				// Optional.empty() Represents an
																				// Optional object with no value

		if (empOptional.isPresent())
			System.out.println(empOptional.get().length());
		else
			System.out.println("nodata");
	}

}
