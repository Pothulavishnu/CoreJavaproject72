package com.fundamentals;


//==operates checks content if it is primitive data types.
//==operates checks object address if it is object data types.
//if we want compare  the content of string object will use.equals()method from string
public class Datatype4 {
        
	public static void main(String[] args) {
		System.out.println("main method started");
		 int a=10;
         int b=10;
         

		System.out.println(a == b);
		
		String str ="Vish";//string literal-->scp:string constant pool.
		String str1 =new String("Java");//string object:heap memomry.
		String str2="Vish";
		String str3 =new String("Guna");//2objects:
		String str4="Guna";

				
		System.out.println(str == str1);//false
		System.out.println();
		System.out.println(str == str2);//true
	}

}
