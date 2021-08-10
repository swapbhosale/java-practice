package com.tcs.entity;

public class staticDemo {
	public static void main(String[] args) {
		Bank bank=new Bank();
		Bank.createNewAccountNumber();
		Bank.createNewAccountNumber();
		
	}
}
class Bank{
	static int counter;
	public static void createNewAccountNumber() {
		++counter;
		System.out.println(counter);
		
	}
	
}
