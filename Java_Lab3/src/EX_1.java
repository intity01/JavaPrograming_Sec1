import javax.swing.*; //input data from Dialog box
import java.text.*; //จัดรูปเเบบตัวเลข

public class EX_1 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		int numberOfCustommer = Integer.parseInt(
				JOptionPane.showInputDialog("How many custommer per bill"));
		double discount,totalPrice=0;
		//calculate total price of buffet
		totalPrice = BUFFET * numberOfCustommer;
		
		//using Confirm Dialog box
		int member;
		
		do {
			member = JOptionPane.showConfirmDialog(null,"Total Price"
					+ totalPrice + " baht."
					+ "\nDo you have member card?" );
					
		}
		while(member==JOptionPane.CANCEL_OPTION);
		
		if(member == JOptionPane.YES_OPTION) {
			//discount = totalPrice - (totalPrice*10/100);
			discount = totalPrice * 90/100; 
			JOptionPane.showMessageDialog(null, 
					"Amount to be paid is " + frm.format(discount) + " baht.");
		}//end if
		else if(member==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null,
					"Amount to be paid is " + frm.format(totalPrice) + " baht.");
		}
		
		 

	}
}
