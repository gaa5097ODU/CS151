
import java.util.Scanner;
import java.lang.Math;

public class Assignment2 {

	public static void main(String[] args) {
		
		/// Declare constants:
		final double COST_PER_GALLON = 2.75;
		final double OIL_CHANGE_PER3_MONTHS = 50.00;
		final double BASIC_UPKEEP_PER_YEAR = 400.00;
		final double ANNUAL_PARKING_PASS = 306.00;
		
		// Declare variables for user input:
		String carBrand;
		String carName;
		int carYear;
		double carCost;
		double downPayment;
		double yearlyInterestRate;
		int loanTerm;
		double mpg;
		double yearlyMileage;
		
		/// Declare Scanner object:
		Scanner input = new Scanner(System.in);
		
		/// Prompt user for input:
		System.out.print("Enter the car brand (HONDA, FORD, CHEVY, ETC): ");
		carBrand = input.nextLine();
		
		System.out.print("\nEnter the car name (FOCUS, CAMRY, CAMARO, ETC): ");
		carName = input.nextLine();
		
		System.out.print("\nEnter the car year: ");
		carYear = input.nextInt();
		
		System.out.print("\nEnter the car cost (USD): ");
		carCost = input.nextDouble();
		
		System.out.print("\nEnter the down payment (USD): ");
		downPayment = input.nextDouble();
		
		System.out.print("\nEnter the yearly interest rate (%): ");
		yearlyInterestRate = input.nextDouble();
		
		System.out.print("\nEnter the term of the loan in months (36,48,etc): ");
		loanTerm = input.nextInt();
		
		System.out.print("\nEnter the car MPG: ");
		mpg = input.nextDouble();
		
		System.out.print("\nEnter the mileage used per year: ");
		yearlyMileage = input.nextDouble();
		
		// Close the Scanner:
		input.close();
		
		// Perform calculations:
		
		/// Calculate monthly interest rate (r)
		double r = (yearlyInterestRate/100)/12;
		
		/// Calculate Principle on the loan
		double principle = carCost - downPayment;
				
		/// Calculate Monthly Loan Payment:
		double monthlyLoanPayment = (principle)*(r * Math.pow(1 + r, loanTerm))/(Math.pow(1 + r, loanTerm)- 1);
				
		/// Calculate Yearly Gas Cost:
		double yearlyGasCost = (yearlyMileage / mpg) * COST_PER_GALLON;
		
		/// Calculate Annual Oil Change Cost
		double annualOilChangeCost = OIL_CHANGE_PER3_MONTHS * 4;
		
		/// Calculate Annual Cost:
		double annualCost = yearlyGasCost + ANNUAL_PARKING_PASS + annualOilChangeCost + 
				           BASIC_UPKEEP_PER_YEAR + monthlyLoanPayment * 12;
		
		/// Calculate Monthly Cost:
		double monthlyCost = annualCost / 12;
		

		// Output results to the user:
		
		/// Output Monthly Interest Rate (r):
		System.out.println("\nr = " + r);
		
		/// Output pattern and Cost Analysis title:
		System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("\nCost Analysis");
		
		/// Output Car Name:
		System.out.println("\nCar Name: " + carYear + " " + carBrand + " " + carName);
		
		/// Output Loan Principle:
		System.out.printf("\nPrinciple: $%.2f", principle);
		
		/// Output Interest Rate:
		System.out.printf("\n\nInterest Rate %.2f ", yearlyInterestRate);
		System.out.print("%");
		
		/// Output Loan Term:
		System.out.println("\n\nLoan Term: " + loanTerm);
		
		/// Output Monthly Loan Payment:
		System.out.printf("\nMonthly Loan Payment: $%.2f", monthlyLoanPayment);
		
		/// Output Yearly Fuel Cost:
		System.out.printf("\n\nYearly Fuel Cost: $%.2f", yearlyGasCost);
		
		/// Output Annual Maintenance Cost:
		System.out.printf("\n\nAnnual Maintenance Cost: $%.2f", BASIC_UPKEEP_PER_YEAR);
		
		/// Output Annual Oil Change Cost:
		System.out.printf("\n\nAnnual Oil Change Cost: $%.2f", annualOilChangeCost);
		
		/// Output Annual Parking Pass Cost:
		System.out.printf("\n\nAnnual Parking Pass: $%.2f", ANNUAL_PARKING_PASS);
		
		/// Output Total Annual Cost:
		System.out.printf("\n\nTotal Annual Cost: $%.2f", annualCost);
		
		/// Output Total Monthly Cost:
		System.out.printf("\n\nTotal Monthly Cost: $%.2f", monthlyCost);
					
		
	}
		
}
