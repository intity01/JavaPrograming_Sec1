import javax.swing.*;
import java.text.DecimalFormat;
public class Example4 {

	public static void main(String[] args) {
		//Format
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		String productName = JOptionPane.showInputDialog("Input product name : ");
		
		//String strUnit = JOptionPane.showInputDialog("Input product unit : ");

		//int productUnit = Integer.parseInt(strUnit);
		int productUnit = Integer.parseInt(JOptionPane.showInputDialog("Input product unit : "));
		
		String strPrice = JOptionPane.showInputDialog("Input price per unit : ");
		float pricePerUnit = Float.parseFloat(strPrice);
		//calculate data to dialog box
		float totalPrice = productUnit * pricePerUnit;
		float addVat = totalPrice + (totalPrice*7/100);
		
		JOptionPane.showMessageDialog(null, "Total Price is "
				+ frm.format(totalPrice) +" baht." 
				+"\nAdd VAT 7% is "+frm.format(addVat)+" baht."
				, "INFORMATION_MESSAGE"
				, JOptionPane.INFORMATION_MESSAGE);
	}

}
