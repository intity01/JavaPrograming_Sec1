
import java.util.*;
public class Ex_503 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			//1.input sentence
			System.out.print("Input a sentence: ");
			String sentence = input.nextLine();
			//2.check sentence end of . or not 
			while(!sentence.endsWith(".")) {
				System.out.print("Input a sentence, again: ");
				sentence = input.nextLine();
				
			}
			System.out.println();
			//3.loop for check spacebar
			int spBar = 0;
			for(int i=0;i<sentence.length();i++) {
				if(sentence.charAt(i)==' ') {
					spBar++;
				}
			}
			System.out.println("This sentence has "+ spBar +" spacebar.");
			System.out.println("This sentence has "+ (spBar+1) +" word.");

	}

}
