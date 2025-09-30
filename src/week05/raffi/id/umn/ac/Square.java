package week05.raffi.id.umn.ac;

public class Square extends Shape{
	private double sisi;
	
	public Square () {}
	public Square (double sisi, String color) {
		super(color);
		this.sisi=sisi;
	}
	
	public double getSisi() {
		return sisi;
	}
	public double getArea() {
		return sisi * sisi;
	}
	public double getPerimeter() {
		return 4* sisi;
	}
}
