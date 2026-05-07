package com.fundamentals;


//Floating literals
public class Literals2 {
	
	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Literals2 L=new Literals2 ();
		System.out.println(L);//2b2fa4f7
		System.out.println(L.hashCode());
		int a =0x2b2fa4f7;
		System.out.println(a);
		
		
		float f1=10;
		float f2=15f;
		//float f3=15.14;//Type mismatch: cannot convert from double to float
		float f4=123;
		float f5=0123;
		//float f6=0123.5;//Type mismatch: cannot convert from double to float
		float f7=0123.5f;
		float f8=0x123;
		float f9=0x123f;
		//float f10=0x123.5f;//Invalid hex literal number
		
		System.out.println(f1);
		System.out.println(f2);
		//System.out.println(f3);
		
		System.out.println(f4);
		
		System.out.println(f5);
		
		//System.out.println(f6);
		
		System.out.println(f7);
		
		System.out.println(f8);
		
		System.out.println(f9);
		//System.out.println(f10);
		//System.out.println(f2);
		
		
		
		
		
		

	}

}
