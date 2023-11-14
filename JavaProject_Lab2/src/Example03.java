import java.text.DecimalFormat;
import java.util.*; //import for input data from keyboard STEP 1
public class Example03 {

	public static void main(String[] args) {
		//STEP 2
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner input = new Scanner(System.in);
		//STEP 3
		System.out.print("INPUT PRODUCT NAME : ");
		String productName = input.nextLine();
		System.out.print("INPUT PRODUCT UNIT : ");
		int productUnit = input.nextInt();	
		System.out.print("INPUT PRICE PER UNIT : ");
		double productPerPrice = input.nextDouble();
		System.out.println();
		
		double totalPrice = productUnit * productPerPrice;
		System.out.println("TOTAL PRICE IS " + frm.format(totalPrice) + " baht.");
		double addVat = totalPrice + (totalPrice*7/100);
		System.out.println("ADD VAT 7% "+ frm.format(addVat) + " baht.");
		
		
	}

}
