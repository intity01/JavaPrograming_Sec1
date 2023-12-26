import java.util.*;
public class JAVA__LAB603 {

	public static void main(String[] args) {
		Scanner fName = new Scanner(System.in);
		String fullname = fName.next();
		System.out.print("Please enter your name, separated by a space. \n:");
		int fNames = fullname.trim().indexOf(" ");
		String space = fullname.substring(0,fNames);
		
		abbreviatName(fullname);

	}
	public static String abbreviatName(String fullname) {
		return fullname;
		for(int i=0;i<=fullname.length();i++) {
			--
		}
	}

}
