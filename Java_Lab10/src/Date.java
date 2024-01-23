
public class Date {
	private int dMonth, dDay, dYear;	
	Date(){
		   dMonth =1;
		   dDay = 1;
		   dYear = 1900;
	}
	Date(int month ,int day, int year) {
		dMonth = month;
		dDay = day; 
		dYear = year;
	}
	public void setDate(int month, int day,int year) {
		   dMonth = month;
		   dDay = day;
		   dYear = year;
	}
	public int getMonth() {
		return dMonth;
	}
	public int getDay() {
		return dYear;
	}
	
	//method to return the year
	public int getYear() {
		return dYear;
	}
	
	//method to return the date in the form mm-dd-yyyy
	public String toString() {
		return dMonth + "-" + dDay + "-" + dYear; 
	}
	
}
