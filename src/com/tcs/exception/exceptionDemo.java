package com.tcs.exception;

public class exceptionDemo {
	public static void main(String[] args) {
		try {
		System.out.println(1);
	}
		catch(ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println("Divison by zero");
		}
		}

}
