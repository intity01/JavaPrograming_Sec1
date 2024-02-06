import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lab1205 {
	public static void main(String[] args) throws IOException{
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtfile//student.txt"));
		String tmp = "";
		int i = 1;
		header();
		
		while((tmp=readFile.readLine())!=null) {
			String[] resultD= tmp.split(" ");
			
			System.out.println(i+".\t"+resultD[0]+"\t"+level(resultD[0])+"\t"+resultD[2].charAt(0)+"."+resultD[3]+"\t"+resultD[4]+"\t"+status(Double.parseDouble(resultD[4])));
			i++;
		}readFile.close();
	}
	public static String level(String id) throws IOException{
		if(id.substring(0,2).equals("19")) {
			return "3th";	
		}
		else return "4th";
		
		
	}
	public static String status(double grade) throws IOException {
		if(grade>=2) {
			return "Pass";
		}
		else if(grade>=1&&grade<=2) {
			return "Critical";
		}
		else return "Retired";
		
		
	}
	public static void header() {
		System.out.println("No.\tID\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("****************************************************************");
	}
}
