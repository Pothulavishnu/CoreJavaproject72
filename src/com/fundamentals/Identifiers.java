package com.fundamentals;

public class Identifiers {



	int stu_id;
	String stu_name;

	String var;

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Identifiers t1 = new Identifiers();
		System.out.println(t1.stu_id);
		System.out.println(t1.stu_name);
		t1.method$1();

	}

	void method$1() {
		System.out.println("method1 called");
	}

}