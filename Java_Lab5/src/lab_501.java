import java.util.*;
public class lab_501 {

	public static void main(String[] args) {
		Scanner inputFN = new Scanner(System.in);
		System.out.print("Full Name: ");
		String amd = inputFN.nextLine();
		int sBar = amd.trim().indexOf(" ");
		String sad = amd.toLowerCase();
		if(sBar==-1) {
			System.out.print("Incorrect Name");
		}
		else System.out.print(
				"First Name: "+sad.substring(0,sBar)
				+"\nlast Name: "+sad.substring(sBar+1));
	}

}
