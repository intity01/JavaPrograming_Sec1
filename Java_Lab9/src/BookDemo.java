import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		
		//Scanner b1 = new Scanner(System.in);
		Book b1 = new Book();
		Scanner bb = new Scanner(System.in);
		
		System.out.print("Input book title   : ");
		String B1 = bb.nextLine();
		b1.setTitle(B1);
		
		System.out.print("Input book price   : ");
		String B2 = bb.nextLine();
		float B21 = Float.parseFloat(B2);
		b1.setPrice(B21);
		
		System.out.print("Input publish year : ");
		String B3 = bb.nextLine();
		int B31 = Integer.parseInt(B3);
		b1.setPublishyear(B31);
		
		System.out.println();
		System.out.println("Title: "+b1.getTitle()+" published for "+b1.getPublishyear()+" year"+"("+b1.getPrice()+" baht.)");
	}

}
