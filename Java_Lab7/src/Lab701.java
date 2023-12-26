import java.util.*;
public class Lab701 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] number = new int[7];
		for(int i=0;i<number.length;i++) {
			System.out.print("Input number "+ (i+1)+":");
			number[i] = scan.nextInt();
		}
		int totalNum = odd(number);
		int totalNum1 = odd2(number);
		System.out.print("There are "+ totalNum+" odd number.");
		
		int a =0;
		for(int i=0;i<totalNum;i++) {
			if(number[i]%2==1) a = number[i]; 
		}
		System.out.print("\nList of add number : ");
		
		
	}
	public static int odd(int[] nums) {
		int sum=0;
		for(int _nums:nums) {
			if(_nums%2!=0) {
				sum++;
			}
		}
		return sum;
		}
	public static int odd2(int[] nums) {
		int sum=0;
		for(int _nums:nums) {
			if(_nums%2!=0) {
				System.out.print(_nums+"");
			}
		}
		return sum;
	}
}