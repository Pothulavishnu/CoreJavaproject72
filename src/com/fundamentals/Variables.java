package com.fundamentals;



//Types variables 
//static Data we can access directly, By using class names also.

//NOte : 
//- static data we can access directly any where whether it is a static context or instance context.
//- instance data we can access directly in instance context but 
//if we want to access in static context we need to create object.


public class Variables {
	
	
	//instance +primitive variable
	int id=333;
	
	//instance +object variable
	String name="Vish";
	
	//static +object variable
	static String clgName ="Saveetha";
	
	//static +primitive variable
	static int clgID=520;
	
	public static void main(String[] args) {
		System.out.println("main method started ");
		System.out.println("Variables");
		
		Variables v= new Variables();
		
//		 Accessing the static data directly 
		System.out.println("clgID:"+ clgID);
		System.out.println("clgName:"+ clgName);
		
		
//		Accessing the static data by using class name		

		System.out.println("clgID:"+ Variables.clgID);
		System.out.println("clgName:"+ Variables.clgName);

//		Accessing the static data by using Object Reference variable 
//		The static field Variables.clgId should be accessed in a static way
        System.out.println("clgID:"+v.clgID);
//		The static field Variables.clgName should be accessed in a static way
        System.out.println("clgName:"+v.clgName);

//		Accessing the instance data by using Object reference variable.
        System.out.println("ID:"+v.id);
        System.out.println("Name:"+v.name);
//	The static field Variables.clgName should be accessed in a static way
	
        Variables v1=null;
        System.out.println(v1.clgName);
        System.out.println(v1.name);//NPE : NullPointerException
		System.out.println("main method ended !!");
	}
}
