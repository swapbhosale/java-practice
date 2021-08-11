package com.tcs.entity;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		EnhacnedForLoopDemo();
	}

	private static void EnhacnedForLoopDemo() {
		int[] number = {3,4,-1,2,6};
		int[] numbers;
		for(int number1 : numbers) {
			System.out.println(number1);
			break;
		}
	}

	private static void demo1() {
		int[] numbers= new int[10];
		numbers[0] = 3;
		numbers[4] = 1;
		Arrays.sort(numbers,0,numbers.length);
		
	}
}
