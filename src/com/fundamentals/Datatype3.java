package com.fundamentals;

import java.math.BigInteger;
import java.util.Scanner;
import java.math.BigDecimal;


class Guna{
	
}
public class Datatype3 {
	//int is convert into integer :
	//auto-boxing- primitive data type to wrapper object data type.
	
	Integer i1 =100;
	
	//integer is convert into int
	//auto-unboxing: convert wrapper object to primitive data type.
	
	int i2=i1;
	
	Float f1 =22f;
	Double d =5.5d;
	
	String s="Vish";
	String s1= new String();
	Scanner sc= new Scanner(System.in);
	BigInteger b1=new BigInteger("2345678899011120");
	BigInteger b2=new BigInteger("2345678899011120");
	
	
	BigDecimal b3=new BigDecimal("2345678987654322123456.3456789");
	
	 String g="nickname";

	public static void main(String[] args) {
		System.out.println("main method started");
		Datatype3 d = new Datatype3();
		System.out.println(d.i1);
		System.out.println(d.f1);
		System.out.println(d.d);
		
		System.out.println(d.s);
		System.out.println(d.b1);
		System.out.println(d.b2);
		//the operator + is undefined for the argument type(s)
		//java.math.BigInteger,java.amth.BigDecimal.
		//System.out.println(d.b1+d.b2);
		System.out.println(d.b1.add(d.b2));
		System.out.println(d.b1.subtract(d.b2));
		System.out.println(d.b1.subtract(new BigInteger("10")));
		
		System.out.println(d.b3);
		
		System.out.println(d.g);
		
	}

}
