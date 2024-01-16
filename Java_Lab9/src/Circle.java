
public class Circle {
	//the public constants
	public static final double DEFAULT_RADIUS	=	1.0;
	public static final String DEFAULT_COLOR	=	"red";
	
	//define 2 private attribute
	private double radius;
	private String color;
	
	//default Constructor
	///////////// 1st Constructor
	Circle(){
		radius = DEFAULT_RADIUS;
		color = DEFAULT_COLOR;
	}
	
	//constructor with parameter radius and default color
	/////////////// 2nd Constructor
	Circle(double radius){
		this.radius=radius;
		this.color=DEFAULT_COLOR;
	}
	
	//constructor with parametor radius and color
	//3rd Constructor
	Circle(double radius, String color){
		this.radius = radius;
		this.color= color;
	}
	
	//return the radius-the public getter for private attribute radius
	public double getRadius() {
		return this.radius;
	}
	public void setRadius(double radius) {this.radius = radius;}
	public String getColor() {return this.color;}
	public void setColor(String color) {this.color=color;}
	public String toString() {return "Circle[radius = "+radius +",color= "+color + "]";}
	public double getArea() {return getRadius() * getRadius() * Math.PI;}
	public double getCircumference() {return 2.0 * Math.PI * getRadius();}//return getCircumference
}
