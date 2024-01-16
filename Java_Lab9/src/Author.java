
public class Author {
	private String name, email; private char gender;
	public Author(String name, String email, char gender) {	}
	public Author(String name, String email) { }
	public Author() { }
	public String getName() {return name;}
	public String getEmail() {return email;}
	public String getGenderName() {if(gender == 'm'||gender == 'M') {return "MALE";}
								else if(gender == 'f'||gender == 'F') {return "FEMALE";}
								else return "NULL";}
	public String toString() {return "Author name: "+name+"("+email+";"+getGenderName()+")";}
}
