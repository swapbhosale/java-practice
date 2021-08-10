package com.tcs.entity;

public class User {
	private String name;
	private Long mobileNumber;
	private byte age;
	public String getName() {
		return name;
	}
	public User(String name, Long mobileNumber, byte age) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[name="+name+"]";	}
}
