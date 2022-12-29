package kr.ac.kopo.day08.figure01;

public abstract class Shape {

	private double area;
	protected String name;
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public double getArea() {
		return area;
	}
	
	public abstract void printArea();
}
