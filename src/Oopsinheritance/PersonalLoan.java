package Oopsinheritance;

import java.util.Scanner;

//operators
//logical statements
//oops 
public class PersonalLoan extends LoanImpl {
	
	void getpersonalLoanDocInfo() {
		System.out.println("All Personal Loan Documents submitted Successfully !!");
	}

	public static void main(String[] args) {
		System.out.println(" Main Method Started ");
		System.out.println(" Welcome To Vcube Personal Loan Banking ");
		
		PersonalLoan pl = new PersonalLoan();
		
		
		
		if(pl.isPhoneValid() && pl.isAadharValid () && pl.isPANValid()) {

			double income = pl.getCustomerSalary();
			
			int cibilscore = pl.getCibilScore();
			
			int age = pl.getAgeInfo();
			
			if ((age >= 22 && age <= 62) && income>=50000.00 && cibilscore >=450 && cibilscore <=900 ){
				System.out.println(" Congratulations !! You are Eligible for Personal Loan ");
				double roi = pl.getROI();
				
				if(cibilscore >=450 && cibilscore <=600) {
					System.out.println(" Poor Score ");
					roi = roi + 3.5;
			}else if(cibilscore >600 && cibilscore <=700) {
				System.out.println(" Fair Score ");
				roi = roi + 2.5;
			}else if(cibilscore >700 && cibilscore <=800) {
				System.out.println(" Good Score ");
				roi = roi + 1.5;
			}else {
					System.out.println("Excellent Score");
				roi = roi + 1.0;
			}
				
				System.out.println("As your eneterd details are "+pl.getAddressDetails());
			}else {
				System.out.println(" Sorry !! Your Not Eligible For Loan ");
			}
	}else {
		System.out.println(" Something Went With Personal Details Check and re-enter");
	}
		
	}

}
