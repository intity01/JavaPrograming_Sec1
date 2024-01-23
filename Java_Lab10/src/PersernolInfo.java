
public class PersernolInfo {
	private Person name;
	private Date bDay;
	private int personID;
	//default constructor 
	PersernolInfo() {name= new Person();	bDay= new Date();	personID= 0; }
	
	PersernolInfo(String first, String last, int month, int day, int year, int ID){
		//initialize the object name
		name = new Person(first, last);
		//initialze the object bDay
		bDay= new Date(month, day, year);
		personID= ID;
		
	}
	//Method to set the personal information
	public void setPersonalInfo(String first, String last, int month, int day, int year, int ID) {
		name.setName(first, last);
		bDay.setDate(month, day, year);
		personID = ID;
	}
	//Method to return the String containing personal information
	public String getFirstName() {
		return "Name: "+ name.toString() + "\n" + "Date of birth: " + bDay.toString() + "\n" + "Personal ID: " + personID;
	}
}
