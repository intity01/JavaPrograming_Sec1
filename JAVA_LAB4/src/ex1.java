import java.util.*;
public class ex1 {

	public static void main(String[] args) {
		//define object for input data from keyboard
		Scanner scan = new Scanner(System.in);
		
		//display message and input data first number
		System.out.print("Input a number : ");
		int previousNumber = scan.nextInt();
		
		int currentNumber;
		//loop for input next number
		while(true) {
			System.out.print("Input a number : ");
			currentNumber = scan.nextInt();
			
			if(currentNumber < previousNumber) {
				System.out.print("Bye bye!!!");
				break;
			}
			previousNumber = currentNumber;
		}
	}

}
