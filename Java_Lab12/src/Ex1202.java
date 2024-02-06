import java.util.Scanner;
import java.io.*;
public class Ex1202 {

	public static void main(String[] args) throws IOException {
		// input data from keyboard(console)
		Scanner input = new Scanner(System.in); 
		System.out.print("Input Section : ");
		int section = input.nextInt();
		Header(section);
		showListStudent(section);
		
		

	}
	public static void showListStudent(int group) throws IOException {
		//read data from file 
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtfile//List107.txt"));
		String tmp = "";
		while((tmp= readFile.readLine()) != null) {
			String[] data = tmp.split("\t");
			//read midTerm and final score from file to display
			double midTermScore = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[5]);
			int sectionFile = Integer.parseInt(data[3]);
			
			if(sectionFile==group) {
				System.out.print(data[0]+"\t"+data[2]+"\t"+midTermScore+"\t" + finalScore+findResult(midTermScore, finalScore));
			}readFile.close();
			
		}readFile.close();
	}
	public static String findResult(double midTermScore,double finalScore) {
		double totalScore = midTermScore + finalScore;
		if(totalScore<=40)return "Fail";
		else return "pass";
	}
	public static void Header(int sec) {
		
		System.out.println("************************************************");
		System.out.println("\tList of Data for Section "+ sec);
		System.out.println("************************************************");
	}

}//end classes
