package areaCalculator;

public class areaOfRectangle {
	
	private double length;
	private double width;
	
	public areaOfRectangle(double length, double width) {
		this.length=length;
		this.width=width;
	}
	
	public void setLength(double length) {
		this.length=length;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setWidth(double width) {
		this.width=width;
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public double getArea() {
		return this.length*this.width;
	}
}
