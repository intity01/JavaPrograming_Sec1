import java.util.*;
public class JAVA__LAB604 {

		static Scanner input = new Scanner(System.in);
		static String studentId, subjectId, sId, subId;
		//static int subjectId;
		
		public static void main(String[] args) {
			inputStudent();
		}	
		public static void inputStudent() {
			do {
				System.out.print("Enter Student Id : ");
				studentId = input.next();
				System.out.print("Enter Subject Id : ");
				subjectId = input.next();
				sId = subjectId + "";
			}while(!isLength(studentId,subjectId));
			System.out.println();
			displayDate(isITStudent(sId), isITSubject(subId));
	}
		public static boolean isLength(String sId, String subId ) {
			if(sId.length()==10 && subId.length()==7) {
				return true;
			}
			else return false;
		}
		public static boolean isITStudent(String sId)
		{
			if(sId.substring(0,3).equals("211")&&sId.substring(3,6).equals("311")) {
				return true;
			}
			else return false;
		}
		public static boolean isITSubject(String subId)
		{
			if(subId.substring(0,2).equals("21")&&subId.substring(3,4).equals("1")) {
				return true;
			}
			return false;
		}
		public static void displayDate(boolean stdIT, boolean subIT) {
			if(stdIT==true) {
				System.out.println("Student id: "+ studentId +
						"is 1st year student in IT");
			}
			else System.out.println("Student id: "+ studentId +
					"is not 1st year student in IT");
			if(subIT==true) {
				System.out.println("Enroll in course for year 1");
			}
			else System.out.println("not Enroll in course for year 1");
		}
			
}
