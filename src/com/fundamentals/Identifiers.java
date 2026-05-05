package com.fundamentals;

public class Identifiers {


   int stu_id=31;
   String stu_name="vish";
   String $_name;
   
	public static void main(String[] args) {
		System.out.println("main method started !!");
		Identifiers i=new Identifiers();
		System.out.println(i.stu_id);
		System.out.println(i.stu_name);
		i.method$();
	}
	void method$() {
		System.out.println("method called");
	}
}