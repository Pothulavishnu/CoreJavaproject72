package com.fundamentals;

public class Literals3 {

	public static void main(String[] args) {
	    System.out.println("main method started");
	    
	    
	    
	    //Boolean literals
	    boolean status=true;
	    
	    if(status) {
	    	System.out.println("Java is simple");
	    }
	    //null literals
	    //in java we want store any values manually for an objecty default,
	    //before creating actual object info we can use null.
	    //note : null is not a keyword. its a literal.
	    String s1=null;
	    Literals3 L=null;
	    
	    //System.out.println(s1.length());//null point exception-null.any exception
	    
	    
	    //String literals - collection of Char store into a ssingle variables 
	    String s="Vish";
	    System.out.println(s);
	        
	    
	    //Char literals
	    char c1='A';//single quote value
	    char c2=72;//ascii value
	    char c3='\uafab';//unicode value
	    
	    
	    
	    System.out.println(c1);
	    
	    System.out.println(c2);
	    
	    
	    System.out.println(c3);
	    
	    System.out.println();
	    
	    

	}

}
