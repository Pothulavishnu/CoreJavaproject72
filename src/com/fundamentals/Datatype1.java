package com.fundamentals;

import java.util.Scanner;

import corejava_labpractice.Student;

import java.lang.System;
import java.lang.String;
import corejava_labpractice.Student;
public class Datatype1 {
  
	int add() {
		System.out.println();
		return 100 + 200;
	}
	int age=22;
	void getinfo(){
		System.out.println("Age is:"+ this.age);
	}

	
	public static void main(String[] args) {
		Datatype1 d = new Datatype1();
		d.getinfo();
		int age=22;
		float height=5.9F;
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		System.out.println(age);
		System.out.println(height);
		System.out.println();
		System.out.println();
		System.out.println();
		
		
	}
 
}
