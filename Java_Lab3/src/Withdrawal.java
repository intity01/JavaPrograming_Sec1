import javax.swing.*;
import java.text.*;
import java.util.*;

public class Withdrawal {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Random rand = new Random();
		int balance = rand.nextInt(9)*100000;
		
		int withDrawalMoney = Integer.parseInt(JOptionPane.showInputDialog("Your balance : "+ frm.format(balance)
			+""+"\nInput money to withdraw : "));
		/*if(withDrawalMoney<=balance ) JOptionPane.showMessageDialog(null, "You with draw "+ frm.format(withDrawalMoney)
				+ "\n");*/
		int with = withDrawalMoney/1000;
		int with2 = withDrawalMoney%1000/500;
		int with3 = withDrawalMoney%500/100;
		
		if(withDrawalMoney>20000) JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than balance ","ERROR",JOptionPane.ERROR_MESSAGE);
		else if(withDrawalMoney>balance) JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than " +frm.format(20000),"ERROR",JOptionPane.ERROR_MESSAGE);
		else if(withDrawalMoney%100!=0) JOptionPane.showMessageDialog(null, "Error:Cannot withdraw "+withDrawalMoney%100+" baht.","ERROR",JOptionPane.ERROR_MESSAGE);
		else {
			JOptionPane.showMessageDialog(null, "You with draw "+ withDrawalMoney
			+ "\n1000="	+ with
			+ "\n500="	+ with2
			+ "\n100="	+ with3);
		}
		
		
		
		
		

	}

}
