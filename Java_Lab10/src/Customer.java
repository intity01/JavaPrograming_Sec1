
public class Customer {
	private int id,discount;
	private String name;
	
	public Customer(int id,String name, int discount){
		this.id =id;
		this.discount=discount;
		this.name=name;
	}
	public int getID() {return this.id;}
	public String getName() {return this.name;}
	public int getDiscount() {return this.discount;}
	public void setDiscount(int discount) {discount=discount*100;}
	public String toString() {return "name ("+id+")("+discount+"%)";}
}
