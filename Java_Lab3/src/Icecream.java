import javax.swing.JOptionPane;
import javax.swing.*;
import java.text.*;
import java.util.*;

public class Icecream {

	public static void main(String[] args) {
		int VANILLA = 10;
		int CHOCOLATE = 15;
		int TOPPING= 5;
		int Shosen;
		
		do{
			Shosen = Integer.parseInt(JOptionPane.showInputDialog(null,"[1] Vanilla Flavor 10 B."+""
		
				+ "\n[2] Chocolate Flavor 15 B."
				+ "\nPress number to choose flavor:"));
		
		if(Shosen!=1||Shosen!=2) {
			JOptionPane.showMessageDialog(null, "ERROR:Wrong choice!"+"\nTry again...","ERROR",JOptionPane.ERROR_MESSAGE);
			
			}
		}while(Shosen!=1||Shosen!=2);
		/*while(true) {
			Shosen = Integer.parseInt(JOptionPane.showInputDialog(null,"[1] Vanilla Flavor 10 B."+""
					+ "\n[2] Chocolate Flavor 15 B."
					+ "\nPress number to choose flavor:"));
		}*/
	}

}
