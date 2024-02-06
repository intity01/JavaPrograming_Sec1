import java.util.*;
import java.io.*;
import java.nio.file.ReadOnlyFileSystemException;
public class Ex1203 {

	public static void main(String[] args) throws IOException{
		//Using BufferReader Class for read datad from file 
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//Bookdata.txt"));
		String tmp= "";
		int countBook=0, i=1;
		
		while((tmp = readFile.readLine()) != null) {
			String[] data = tmp.split("\t");
			System.out.println("[ "+i+" ] "+data[0]+" ( "+data[1]+" ), Rating "+data[2]+" publish on "+data[5]);
			countBook++;
			i++;
			
		}
		System.out.println("===============================================================================");
		System.out.println("Total Book = "+ countBook);
		
		readFile.close();

	}

}
