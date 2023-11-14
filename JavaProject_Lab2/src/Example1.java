
public class Example1 {

	public static void main(String[] args) {
		String isbn = "IB2-6325-85-4-1" , title = "Basic Java Programming";
		int unit = 5;
		double price = 225.75;
		System.out.println("Book ISBN  : "+isbn);
		System.out.println("Book TITLE : "+isbn);
		System.out.println("Book UNIT  : "+isbn);
		System.out.println("Book PRICE : "+isbn);
		System.out.println("--------------------------------------------------");
		double totalPrice = unit * price;
		System.out.println("Total Price is : "+totalPrice);
		double vat = totalPrice + (totalPrice*7/100);
		System.out.println("ADD VAT 7% : "+vat);
	}

}
