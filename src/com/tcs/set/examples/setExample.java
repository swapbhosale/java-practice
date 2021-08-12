package com.tcs.set.examples;

import java.util.*;

public class setExample {
	public static void main(String[] args) {
		demo1();
		
	}

	private static void demo1() {
		Set<User> users=createSet();
		System.out.println(users);
	}

	private static Set<User> createSet() {
		Set<User> users=new HashSet<User>();
		for (int i=0; i<20; i++) {
			User user= new User();
			user.setAge(10+i);
			users.add(user);
		}
		return users;
	}

}
