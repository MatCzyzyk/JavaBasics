//this program will calculate the monthly car payment a user should expect to make after taking out a car loan.

public class CarLoan {
	public static void main(String[] args) {

	int carLoan = 10000;
  int loanLength = 3; //3 years
  int interestRate = 5; //5% of the loan
  int downPayment = 2000; //down payment provided by a user for this car purchase
  if(loanLength <= 0 || interestRate <=0){
    System.out.println("Error! You must take out a valid car loan");
  }else if (downPayment>=carLoan){
    System.out.println("The car can be paid in full");
  }else{
    int remainingBalance = carLoan-downPayment;
    int months = loanLength*12;
    int monthlyBalance = remainingBalance/months;
    int interest = monthlyBalance*interestRate/100;
    int monthlyPayment = monthlyBalance+interest;
    System.out.println(monthlyPayment);
   
  }

	}
}
