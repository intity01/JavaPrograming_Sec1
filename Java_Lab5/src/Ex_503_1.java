import javax.swing.*;
public class Ex_503_1 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "input a sentence :");
				while(!input.endsWith(".")) {
					input = JOptionPane.showInputDialog(null, "input a sentence, again :");
				}
				System.out.println();
				int eP = 0;
				for(int i=0;i<input.length();i++) {
					if(input.charAt(i)==' ');
					eP++;
				}
				JOptionPane.showMessageDialog(null, 
							"This sentence has "+eP+" sentence."
						+	"\nThis sentence has "+(eP+1)+" word.");

	}

}
