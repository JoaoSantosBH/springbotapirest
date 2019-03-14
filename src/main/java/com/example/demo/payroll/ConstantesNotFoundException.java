package com.example.demo.payroll;

public class ConstantesNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConstantesNotFoundException(int id) {
		super("Could not find constante " + id);
	}
}