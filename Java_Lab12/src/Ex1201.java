import java.io.*;
import java.util.Scanner;
public class Ex1201 {
	public static void main(String[] args) throws IOException{
		//Using Scanner Class for read data from file
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		
		while(readFile.hasNext()) {
			
			String fname = readFile.next();//read firstName from file
			//String lname = readFile.next();//read lastName from file
			readFile.next();
			readFile.next();
			
			String email = readFile.next().toUpperCase(); //read email from file
			System.out.println(fname+" "+"\t( "+email+" ");
		}readFile.close();//close file
		
	}

}
