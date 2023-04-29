package com.basic;

public class MyPrePostOperator {

	public static void main(String[] args) {

		int a=100;
		
		a++;
		System.out.println(a);
		++a;
		System.out.println(a);
		a=(a++)+(++a);
		System.out.println(a);
		
		
	}

}
