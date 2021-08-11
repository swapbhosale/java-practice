package com.tcs.entity;

public class StaticBlockDemo {
	private static int age=10;
	int price=20;
			
	public StaticBlockDemo(){
		System.out.println("in con");
		
	}
	static {
		System.out.println("in static block"+age);
	}
	public static void main(String[] args) {
		StaticBlockDemo s=new StaticBlockDemo();
	}
	void work() {
		int time =45;
	}
}
