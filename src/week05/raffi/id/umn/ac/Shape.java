package week05.raffi.id.umn.ac;

public class Shape {
	private String color;
	
	public Shape () {}
	public Shape (String color) {
		this.color=color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return this.color;
	}
	public double getArea() {
		return 0;
	}
	public double getPerimeter () {
		return 0;
	}
}
