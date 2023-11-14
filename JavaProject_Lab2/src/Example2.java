import java.text.*;
public class Example2 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final double BUFFET = 299;
		int numberOfCustom = 5;
		double netPrice = BUFFET * numberOfCustom;
		System.out.println("Buffet of "+numberOfCustom
				+" customers is "+ frm.format(netPrice));
		
		double serviceCharge = netPrice + (netPrice*3/100);
		System.out.println("Add Service Charge 3% is "
				+"Customer is "+ frm.format(serviceCharge));

	}

}
