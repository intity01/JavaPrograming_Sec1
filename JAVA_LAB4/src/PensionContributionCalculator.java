import java.util.*;
public class PensionContributionCalculator {

	public static void main(String[] args) {
		// Declare constants
		 final int SALARY_CEILING = 6000;
		 final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		 final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		 final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		 final double EMPLOYER_RATE_55_TO_60 = 0.13;
		 final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		 final double EMPLOYER_RATE_60_TO_65 = 0.09;
		 final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		 final double EMPLOYER_RATE_65_ABOVE = 0.075;
		 // Declare variables
		 int salary = 0, age = 0; // to be input
		 int contributableSalary;
		 
		 //Scanner moneys = new Scanner(System.in);
		 System.out.print("Enter the monthly salary : ");
		 Scanner input = new Scanner(System.in);
		 salary = input.nextInt();
		 
		 
		 System.out.print("Enter the age : ");
		 Scanner Ages = new Scanner(System.in);
		 age = Ages.nextInt();
		 double emploYeEContribution, emploYeRContribution, totalContribution;
		 
		 // Check the contribution cap
		 contributableSalary = Math.min(salary, SALARY_CEILING);
		 // Compute various contributions in "double" using a nested-if to handle 4 cases
		 if (age <= 55) { // 55 and below
			 emploYeEContribution=contributableSalary*EMPLOYEE_RATE_55_AND_BELOW ;
			 emploYeRContribution=contributableSalary*EMPLOYER_RATE_55_AND_BELOW ;
			 
			 //totalContribution=emploYeEContribution+emploYeRContribution;
		 } else if (age <= 60) { // (60, 65]
			 emploYeEContribution=contributableSalary*EMPLOYEE_RATE_55_TO_60 ;
			 emploYeRContribution=contributableSalary*EMPLOYER_RATE_55_TO_60 ;
			 
			 //totalContribution=emploYeEContribution+emploYeRContribution;
		 } else if (age <= 65) { // (55, 60]
			 emploYeEContribution=contributableSalary*EMPLOYEE_RATE_60_TO_65 ;
			 emploYeRContribution=contributableSalary*EMPLOYER_RATE_60_TO_65 ;
		 
			 //totalContribution=emploYeEContribution+emploYeRContribution;
		 } else { // above 65
			 emploYeEContribution=contributableSalary*EMPLOYEE_RATE_65_ABOVE ;
			 emploYeRContribution=contributableSalary*EMPLOYER_RATE_65_ABOVE ;
		 
			 //totalContribution=emploYeEContribution+emploYeRContribution;
		 }
		 totalContribution=emploYeEContribution+emploYeRContribution;
		 System.out.print("The employee's contribution is: "+emploYeEContribution+""
		 		+ "\nThe employer's contribution is: "+emploYeRContribution
		 		+ "\nThe total contribution is: "+totalContribution);
	}

}
