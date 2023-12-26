import javax.swing.*;
public class Lab_601 {

	public static void main(String[] args) {
		inputEmail();
	}
	public static void inputEmail() {
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail :");
		while(inputEmail.startsWith("@")||inputEmail.startsWith(" ")) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail, Again :");
		}
		boolean validateEmail = checkEmail(inputEmail);
		if(validateEmail) {//if(validateEmail==true)
			JOptionPane.showMessageDialog(null, 
					"Your e-mail is "+ inputEmail.toLowerCase());
		}
		else JOptionPane.showMessageDialog(null, 
				"Your e-mail is not hotmail or gmail dot com");
	}
	
	public static boolean checkEmail(String email) {
		if(email.endsWith("hotmail.com")||email.endsWith("gmail.com")) {
		return true;
		}
		
		else return false;
		//return false;
	}

}
