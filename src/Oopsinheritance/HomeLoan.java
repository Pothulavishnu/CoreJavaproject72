package Oopsinheritance;

//operators
//logical statements
//oops 

import java.util.Scanner;
public class HomeLoan extends LoanImpl {

	void getAllHomeLoanDocInfo() {
		System.out.println(" Home Loan Documents Have Been Submitted Successfully");
	}
		public static void main(String[] args) {
			System.out.println(" Main Method Started ");
			System.out.println(" Welcome To Vcube Home Loan Banking ");
			
			HomeLoan hl = new HomeLoan();
			
			
			
			if(hl.isPhoneValid() && hl.isAadharValid () && hl.isPANValid()) {

				double income = hl.getCustomerSalary();
				
				int cibilscore = hl.getCibilScore();
				
				int age = hl.getAgeInfo();
				
				if ((age >= 18 && age <= 75) && income>=30000.00 && cibilscore >=300 && cibilscore <=900 ){
					System.out.println(" Congratulations !! You are Eligible for Home Loan ");
					double roi = hl.getROI();
					
					if(cibilscore >=300 && cibilscore <=600) {
						System.out.println(" Poor Score ");
						roi = roi + 1.5;
				}else if(cibilscore >600 && cibilscore <=700) {
					System.out.println(" Fair Score ");
					roi = roi + 1.0;
				}else if(cibilscore >700 && cibilscore <=800) {
					System.out.println(" Good Score ");
					roi = roi + 0.5;
				}else {
						System.out.println("Bad Score");
					roi = roi - 2.0;
				}
					System.out.println(" Your Rate Of Interest is : " +roi);
					
					System.out.println("As your eneterd details are "+hl.getAddressDetails());
				}else {
					System.out.println(" Sorry !! Your Not Eligible For Loan ");
				}
		}else {
			System.out.println(" Something Went With Personal Details Check and re-enter");
		}
			
		}

	}


