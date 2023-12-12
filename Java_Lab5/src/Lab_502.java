import java.util.*;
public class Lab_502 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String j = in.nextLine();
		Scanner sP = new Scanner(System.in);
		System.out.print("The sentence must end wtih full stop point : ");
		String k = sP.nextLine();
				
		while(!k.endsWith(".")) {
			System.out.print("The sentence must end wtih full stop point : ");
			k = sP.nextLine();
		}
		
		int sbar = 0;
		for(int i=0;i<k.length();i++) {
			if(k.charAt(i)==' ') {
				System.out.println();
				//System.out.print(k);
			}
			else {
				System.out.print(k.charAt(i));
			}
			//System.out.println();
			//System.out.print(k.substring(0,sbar));
		}
				
		
	}

}
