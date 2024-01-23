
public class Person {
	private String firstName, lastName;
	Person(){
		firstName=lastName="";
	}
	
	//Constructor with parameter
	Person(String first, String last){
		firstName=first;//setName(first, last);
		lastName=last;
	}
	
	//method to set firstName and lastName with parameters
	public void setName(String first,String last) {
		firstName=first;
		lastName=last;
	}
	//method to return firstName
	public String getFirstName() {
		return firstName;
	}
	//method to return firstName
	public String getLastName() {
		return lastName;
	}
	//return to set firstName and lastName with 
	public String toString() {
		return firstName+" "+lastName;
	}
}
