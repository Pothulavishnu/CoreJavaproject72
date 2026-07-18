package Oopsinheritance;

//interface : SRS document
//SRS means : service or software requirement specification
//By default all methods from interface public & abstract
public interface Loan {
	
	String getAddressDetails() ;
	
	boolean isPhoneValid();
	
	boolean isAadharValid();
	
	boolean isPANValid();
	
	double getCustomerSalary();
	
	int getCibilScore();
	
	int getAgeInfo();
	
	double getROI();

}
