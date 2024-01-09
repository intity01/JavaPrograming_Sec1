
public class TestCircle {
	public static void main (String[] args) {
		//declare to objects reference form Class Circle
		Circle c1= new Circle ();
		Circle c2= new Circle ();
		
		//assign redius to the first Object() and display
		c1.radius= 12.5;
		System.out.println("the area of object() c1 is " + c1.getArea());
		c2.radius= 5.5;
		System.out.println("the area of object() c1 is " + c2.getArea());
		
		//call static method 
		System.out.println(showColor("red"));
	}
	public static String showColor(String color) {
		return "the color is "+color;
	}
}
