package com.gwc.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gwc.calculator.service.CalculatorService;


@RestController
@RequestMapping("/calculate")
public class CalculatorController {
	
	@Autowired
	CalculatorService calculatorService;
	
	@GetMapping (value="/hello")
	public String sayHello() {
		return "Hello !";
	}
	
	@GetMapping (value="/getSum/{p1}/{p2}")
	public int getSum (@PathVariable("p1") int p1, @PathVariable("p2") int p2) {
		return calculatorService.getSum(p1, p2);
	}
	
	@GetMapping (value="/getDifference/{p1}/{p2}")
	public int getDifference (@PathVariable("p1") int p1, @PathVariable("p2") int p2) {
		return calculatorService.getDifference(p1, p2);
	}

	@GetMapping (value="/getProduct/{p1}/{p2}")
	public int getProduct (@PathVariable("p1") int p1, @PathVariable("p2") int p2) {
		return calculatorService.getProduct(p1, p2);
	}
	
	@GetMapping (value="/getDivision/{p1}/{p2}")
	public int getDivision (@PathVariable("p1") int p1, @PathVariable("p2") int p2) {
		return calculatorService.getDivision(p1, p2);
	}
	
	@PostMapping (value="/addNumbers")
	public int addNumber (int[] pIntArray) {
		return calculatorService.addNumber(pIntArray);
	}
	
	@PostMapping (value="/addNumberJSON")
	public int addNumberJSON (@RequestBody int[] pIntArray) {
		return calculatorService.addNumber(pIntArray);
	}
	
	
}


