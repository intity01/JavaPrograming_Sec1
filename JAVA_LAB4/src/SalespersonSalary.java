import java.util.*;
import java.text.DecimalFormat;
public class SalespersonSalary {

	public static void main(String[] args) {
		// Declare constants
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1; // Terminating value for input
		 // Declare variables
		 int sales; // Input gross sales
		 double salary = 0; // Salary to be compute
		 DecimalFormat w = new DecimalFormat("#,###.00");
		 
		 System.out.print("Enter sales in dollars (or -1 to end): ");
		 Scanner Sales = new Scanner(System.in);
		 sales = Sales.nextInt();
		 
		 System.out.print("Salary is :"+salary);
		 
		 while(true) {
			 System.out.print("Enter sales in dollars (or -1 to end): ");
			 sales = Sales.nextInt();
			 
			 
			 if(sales==-1) {
				 System.out.print("bye");
				 break;
			 	}
			 salary = 1000+ sales * COMMISSION_RATE;
			 System.out.print("Salary is :"+w.format(salary));
		 }
		 
		 }
		 
		 
		 
	}


