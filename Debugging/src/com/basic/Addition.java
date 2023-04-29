package com.basic;

public class Addition {

	private int a;
	private int b;
	private int add;

	public void myAdd(int a, int b) {

		System.out.print("START myAdd");
		add = a + b;
		System.out.println(add);
	}

	public static void main(String[] args) {

		System.out.print("START");
		Addition add = new Addition();
		add.myAdd(10, 20);

	}

}
