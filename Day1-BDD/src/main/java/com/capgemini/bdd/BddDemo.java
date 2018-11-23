package com.capgemini.bdd;

public class BddDemo {

	public static void main(String[] args) {
		
		System.out.println("Heyyyyyy !!");
		int add = sum(5,5);
		System.out.println("sum = "+add);

	}

	private static int sum(int i, int j) {
		return i+j;
	}

}
