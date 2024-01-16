
public class testCircle {

	public static void main(String[] args) {
		// test all constructors and toString
		Circle c1 = new Circle(1.1, "blue");
		System.out.println(c1); //call toString() method
		
		Circle c2 = new Circle(2.2);
		System.out.println(c2);
		
		Circle c3 = new Circle(); //call default constructor
		System.out.println(c3);
		
		//test setters and getters method 
		c1.setRadius(3.3);
		c1.setColor("green");
		System.out.println("The radius is : "	+c1.getRadius());
		System.out.println("The color  is  : "	+c1.getColor());
		
		//test getArea() and getCircumference
		System.out.printf("The area is: %.2f%n",c1.getArea());
		System.out.printf("the circumference is: %.2f", c1.getCircumference());
	}

}
