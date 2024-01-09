
public class Circle_1 {
	private double radius;
	private String Color;
	
	public void setradius(double ra) {
		radius = ra;
	}
	public void setColor(String co) {
		Color = co;
	}
	public String getColor() {
		return Color;
	}
	public double getArea() {
		return Math.PI* radius*radius;
	}
}
