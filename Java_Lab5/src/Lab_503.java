import java.util.*;
public class Lab_503 {

	public static void main(String[] args) {
	Scanner Ms = new Scanner(System.in);
	System.out.print("Message : ");
	String mS = Ms.nextLine();	
	String mA = mS.toLowerCase();
	
	
	String t ="";
	int cWord = 0;
	
	if(mS.indexOf("nichi")>=0) {
		cWord++;
	}
	if(cWord==0) {
		System.out.print(mS );
	}
	
	else {
		System.out.print("Nichi is a sentence");
	}
	
	
	}

}
