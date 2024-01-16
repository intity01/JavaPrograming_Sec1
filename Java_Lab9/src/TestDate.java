
public class TestDate {

	public static void main(String[] args) {
		// Test Constructor and ToString() 
		TheDATEcLASS d1 = new TheDATEcLASS(2023,2,8);
		System.out.println(d1);
		System.out.println();
		
		// Test setters and getters method
		d1.setYear(2012);
		d1.setMonth(12);
		d1.setDay(23);
		//12/23/2012
		System.out.println(d1);
		System.out.println();
		//YEAR is: 2012
		System.out.println("Year is: "+d1.getYear());
		//Month is: 12
		System.out.println("Month is: "+d1.getMonth());
		//Day is: 23
		System.out.println("Day is: "+d1.getDay());
		System.out.println();
		
		d1.setDate(2024, 1, 16);//Test setDate
		System.out.println(d1);
	}

}
