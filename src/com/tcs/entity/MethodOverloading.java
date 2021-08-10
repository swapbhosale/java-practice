package com.tcs.entity;

public class MethodOverloading {
	User1 u1=new User1();
	u1.work();
	u1.work(4);

}
class User1{
	public void work() {
		System.out.println("User is working");
	}
	public void work(int duration) {
		System.out.println("User is working for"+duration+"hours");
	}
}
