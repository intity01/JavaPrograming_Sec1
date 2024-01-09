import java.util.*;
	public class TestPeggyBank {
		static Scanner a = new Scanner(System.in);
		static PiggyBank pb = new PiggyBank();
		public static void main(String[] args) {
			inputCoin();
		/*PiggyBank pb = new PiggyBank();
		pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addtwo (34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addten (13);
		System.out.println("Add 10 Baht Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addfive(100);*/
		 }
		public static void inputCoin() {
			System.out.println("Money Total : "+pb.getTotal());
			System.out.print("Plese define size of PiggyBank: ");
			int sizeofPiggyBank = a.nextInt();
			pb.setPiggyBank(sizeofPiggyBank);
			System.out.print("Size of your PiggyBank: "+ pb.getPiggyBank() );
			System.out.println();
			mainMenu();
			
		}
		
		public static void mainMenu() {
			
			
			while(true) {
				System.out.print("\n=================================="+
						"\nMenu of Piggybank"+
						"\n=================================="
						+"\n[1] one baht."
						+"\n[2] two baht."
						+"\n[3] five baht."
						+"\n[4] ten baht."
						+"\n[5] Exit"
						+"\n=================================="
						+ "\nPlese select Menu[1-5]: ");
				
				int sel = a.nextInt();
				if(sel == 1) {
					System.out.print("Insert "+sel+" Baht. Money: ");
					int	money = a.nextInt();
					pb.addOne(money);
					System.out.print("Money Total: "+pb.getTotal());
				}
				else if(sel == 2) {
					System.out.print("Insert "+sel+" Baht. Money: ");
					int	money = a.nextInt();
					pb.addtwo(money);
					System.out.print("Money Total: "+pb.getTotal());
				}
				else if(sel == 3) {
					System.out.print("Insert "+sel+" Baht. Money: ");
					int money = a.nextInt();
					pb.addfive(money);
					System.out.print("Money Total: "+pb.getTotal());
				}
				else if(sel == 4) {
					System.out.print("Insert "+sel+" Baht. Money: ");
					int	money = a.nextInt();
					pb.addten(money);
					System.out.print("Money Total: "+pb.getTotal());
				}
				else if(sel == 5) {
					System.out.print("Bye Bye");
					break;
					
				}
				else {
					System.out.print("BYE BYE BYE!!!");
				}
				System.out.println();
				//break ;
				
				
			}
			System.out.println();
			
			
		}
	}
