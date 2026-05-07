package com.fundamentals;

//Integral literals
public class Literals1 {
	
	
	
	

	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		//a1-a2 are Decimal literals(base 10: 0-9) 
		int a1=12;
		int a2=123;
		
		//Octal literals (base 8: 0-7) 
		//Octal starts with 0
		//Calculation :1*8^2 +2*8^1 +3*8^0 = 64+16+3=83.
		int a3=0123;
		int a4=0765;
		int a5=03456;
		//int a6=08654;//The literal is out of range
		
		//Hexa-Decimal Literals (base 16: 0-9 numbers a-f/A-F characters)
		//Starts with 0x or 0X
		//Calculation :1*16^2 +2*16^1 +3*16^0 =256+32+3=291
		int a7=0x123;
		int a8=0x1a2b;
		int a9=0xDAD;
		
		//int a10=0xBeer;//Syntax erroer "r" token not in value
		
		//Binary Literals (base:0-1)
		//start with 0b
		
		int a11=0b1010;
		int a12=0b1110;
		int a13=0b1110110;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		System.out.println(a4);
		System.out.println(a5);

		//System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		//System.out.println(a10);
		
		System.out.println(a11);
		System.out.println(a12);
		System.out.println(a13);
		
		
		
		
		

	}

}
