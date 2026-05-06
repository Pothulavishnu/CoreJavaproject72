package com.fundamentals;
//whenever we didnt assign values for static or instance data
//Jvm provide default values for those variables.
//note:
//- by default rhs number related data is int.
//-by default rhs  decimal point data is double.
//order of data types --> byte - short - long - float - double.


public class Datatype2 {
	//range of byte is 2^7---> -128 to 127
	byte b = 127;
	//if we store more than byte value, will get a compile time error.
	//Type mismatch: cannot convert from int to byte.
	//still we want store int value to byte then we should go type casting.
	//Type casting is a one data type into another data type is called Type casting.
	//in java, we two type of casting.
	//i) Implicit Type casting -converting low data type to high data.// byte --- int.
	//ii)Explicit Type casting -converting high data type to low data type.// int ---byte.
	
	
	//int --->byte
	//Range: -128 -127 -126 ---- 0 1 2 3 ---- 127=2^7
	byte b1 =(byte) 256;//-128-->
	
	//Range 2bytes : -32768 to 32767=2^15
	short s =b1;//byte ---> short Implicit type casting.
	short s1 =32767;
	//Explicit type casting 
	short s2 =(short) 32768;//Type mismatch: cannot convert from int to short.
	
	//Range 4bytes: -2147483648 to 2147483647=2^31
	int i =s2;//Implicit type casting
	int i1 =2147483647;
	
	long i2 =2147483648l;//literal 2147483648 of type is out of range.
	
	//Range 8bytes:2^63
	long l =2147483647;//Implicit type casting
    //long l1 =2147483648;//literal 2147483648 of type is out of range.
	long l1 =922337720364775808l;
	
	//Range 4bytes:5-6 decimals =-3.4e38 to 3.4e38
	float f =10;
    //float f1 =5.5;//Type mismatch: cannot convert from double to float.
	float f2 =567.5567990321689f;
	
	//Range:10-15 decimals =-1.7e308 to 1.7e308.
	double d =567.5567990321689d;
	
	//in char a type we can store 
	//single quote char
	//Ascii char values
	//unicode values
	//Range is 2bytes:32768+32767=0 to 65535
	char c ='A';
    //char c1 ='AA'//Invalid character constant
	//A=65 , B=66,  ----Z=90
    //a=97 ,b=98, ---- z=122
	char c2 =6666;//ASCII character values---
	char c3 ='\u0040';
	int i3 ='A';//char can convert int ---> int can convert char.
	
	//Range is 1bit
	//boolean  is only true or false we can store.
	boolean boo =true;
	
	//boolean boo1 =TRUE;
	//boolean boo2 =False;
	//boolean boo3 =True;
	//boolean boo4 =False;
	//boolean boo5 =0;
	//boolean boo6 =1;
	
	

	public static void main(String[] args) {
		Datatype2 d = new Datatype2();
		
		System.out.println("main method started");
		System.out.println("byte value :"+d.b);
		System.out.println("byte value :"+d.b1);
		System.out.println("short value :"+d.s);
		System.out.println("short value :"+d.s1);
		System.out.println("short value :"+d.s2);
		System.out.println("int value :"+d.i);
		System.out.println("int value :"+d.i1);
		System.out.println("int value :"+d.i2);
		System.out.println("int value :"+d.i3);
		System.out.println("long value :"+d.l);
		System.out.println("long value :"+d.l1);
		
		System.out.println("float value :"+d.f);
		//System.out.println("float value :"+d.f1);
		System.out.println("float value :"+d.f2);
		
		
		System.out.println("double value :"+d.d);
		//System.out.println("double value :"+d.d);
		
		System.out.println("char :"+d.c);
		//System.out.println("char :"+d.c1);
		System.out.println("char :"+d.c2);
		System.out.println("char :"+d.c3);
        System.out.println("boolean :"+d.boo);
        
        if(d.boo) {
        	System.out.println("Welcome to Java world");
        }
		
		System.out.println("main method ended");
		
		
		
		
	}

}
