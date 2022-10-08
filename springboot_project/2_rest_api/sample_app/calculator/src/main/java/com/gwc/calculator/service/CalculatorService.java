package com.gwc.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	
	public int getSum (int p1, int p2) {
		return p1 + p2;
	}
	
	
	public int getDifference (int p1, int p2) {
		return p1 - p2;
	}

	
	public int getProduct (int p1, int p2) {
		return p1 * p2;
	}
	
	
	public int getDivision (int p1, int p2) {
		return p1 / p2;
	}
	
	
	public int addNumber (int[] pIntArray) {
		int sum = 0;
		
		for (int i : pIntArray) {
			sum += i;
		}
		
		return sum;
	}
	
}
