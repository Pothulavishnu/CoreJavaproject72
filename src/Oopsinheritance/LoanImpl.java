package Oopsinheritance;

import java.util.Scanner;

public class LoanImpl {


	static Scanner sc = new Scanner(System.in);
	
	String getAddressDetails() {
		String address = " ";
		
		System.out.println("Enter Flat Number :");
		String flat = sc.next();
		
		System.out.println("Enter Plot Details :");
		String plot = sc.next();
		
		System.out.println("Enter Street :");
		String street = sc.next();
		
		System.out.println("Enter City :");
		String city = sc.next();
		
		System.out.println("Enter State & Country :");
		String state = sc.next();
		String country = sc.next();
		
		address = "Falt Number :"+flat+","
				+"Plot Details :"+plot+","
				+"Street :"+street+","
				+"City :"+city+","
				+"State & Country :"+state +","+country;
		
		return address;
	}
	boolean isPhoneValid() {
		System.out.println("enter Your Phone Number : ");
		String phone = sc.next();
	boolean	isPhoneValid= phone.matches("[6-9][0-9]{9}");
	return isPhoneValid;
	}
	
	boolean isAadharValid() {
		System.out.println("Entrer Your Aadhar Number : ");
		String aadhar = sc.next();
		boolean isAadharValid = aadhar.matches("[0-9]{12}");
		return isAadharValid;
	}
	
	boolean isPANValid() {
		System.out.println("Entrer Your PAN Number : ");
		String pan = sc.next();
		boolean isPANValid = pan.matches("[A-Z]{5}[0-9]{4}[A-z]");
		return isPANValid;
	}
	double getCustomerSalary(){
		System.out.println("Enter Your Salary : "); 
		double salary = sc.nextDouble();
		return salary;
	}
	
	int getCibilScore(){
		System.out.println("Enter Your Cibil Score : ");
		int cibilscore = sc.nextInt();
		return cibilscore;
	}
	
	int getAgeInfo(){
		System.out.println("Enter Your Age");
		int age = sc.nextInt();
		return age;
	}
	
	double getROI() {
		
		return 9.5;
	}
	
	public static void main(String[] args) {
		
	}

}
