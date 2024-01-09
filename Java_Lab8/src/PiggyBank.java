
public class PiggyBank {
	public int one, two, five, ten, size;
	public void setPiggyBank(int s) {
			clear();
			size=s;
	}
	public void clear() {
		/*one=two=five=ten=0;*/
		one=0; 
		two=0;
		five=0;
		ten=0;
	}
	public int getTotal() {
		return one+(2*two)+(5*five)+(10*ten);
	}
	public void addOne(int c) {
		if(getTotal()+c<=size) {
			one = one + c;
		}
		else System.out.println("Piggy Bank Full");;
	}
	public void addtwo(int c) {
		if(getTotal()+(2*c)<=size) {
			two = two + c;
		}
		else System.out.println("Piggy Bank Full");;
	}
	public void addfive(int c) {
		if(getTotal()+(5*c)<=size)
		{
			five = five + c;
		}
		else System.out.println("Piggy Bank Full");
	}
	public void addten(int c) {
		if(getTotal()+(10*c)<=size) {
			ten = ten + c;
		}
		else System.out.println("Piggy Bank Full");;
	}
	public int getPiggyBank() {
		// TODO Auto-generated method stub
		return size;
	}
}
