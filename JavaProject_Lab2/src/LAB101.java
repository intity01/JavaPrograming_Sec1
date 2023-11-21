import java.text.DecimalFormat;
import java.util.*;
public class LAB101 {

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
				System.out.println("-----------------------------------------------------------------");
				double totalPrice = productUnit * productPerPrice;
				System.out.println("TOTAL PRICE IS " + frm.format(totalPrice) + " baht.");
				System.out.println("-----------------------------------------------------------------");
				
				System.out.print("HOW MANY DISCOUNT (%) : ");
				int discount = input.nextInt();
				System.out.println("-----------------------------------------------------------------");
				double addVat = totalPrice*15/100;
				System.out.println("ADD VAT 15% "+ frm.format(addVat) + " baht.");
				double paid = totalPrice-addVat;
				System.out.println("PAID "+ frm.format(paid) + " baht.");
				
	}

}
