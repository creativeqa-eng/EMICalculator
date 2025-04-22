package day4;

import java.util.Scanner;

public class EMICalculator {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter loan amount in USD");
		double principal = scanner.nextDouble(); 
		
		System.out.println("Enter annual interest rate (in %)");
		double annualInterestRate = scanner.nextDouble();
		
		System.out.println("Enter loan tenure in years");
		int tenureYears=scanner.nextInt();
		
		int tenureMonths= tenureYears*12; 
		
		double monthlyInterestRate = annualInterestRate/(12*100);
		
		double emi = (principal*monthlyInterestRate*Math.pow(1+monthlyInterestRate, tenureMonths))
				/ (Math.pow(1 + monthlyInterestRate, tenureMonths)-1);
		
		System.out.println("Your monthly EMI is: "+emi);
		
		scanner.close();
	}
	
}
		
		
	

				
		
	
	
		