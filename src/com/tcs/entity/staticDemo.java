package com.tcs.entity;

public class staticDemo {
	public static void main(String[] args) {
		Bank bank=new Bank();
		System.out.println(Bank.createNewAccountNumber());
		System.out.println(bank.instanceVariable);
		Bank.createNewAccountNumber();
		
	}
}
class Bank{
	static int counter;
	int instanceVariable=10;
	public static int createNewAccountNumber() {
		return ++counter ;
		
		
	}
	
}
