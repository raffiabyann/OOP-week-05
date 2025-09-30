package week05.raffi.id.umn.ac;

public class Triangle extends Shape {
	private double alas;
	private double tinggi;
	
	public Triangle () {}
	public Triangle(double alas, double tinggi, String color) {
		super(color);
		this.alas=alas;
		this.tinggi=tinggi;
	}
	public double getAlas() {
		return alas;
	}
	public double getTinggi() {
		return tinggi;
	}
	public double getArea() {
		return 0.5 * alas * tinggi;
	}
	public double getPerimeter() {
		double miring = Math.sqrt(alas * alas + tinggi * tinggi); 
		return alas + tinggi + miring;
	}

}
