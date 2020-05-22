package entities;

public class Rectangle {
	public Double width;
	public Double height;
	
	public Double area() {
		return width * height;
	}
	
	public Double perimeter() {
		return 2 * (width + height); 
	}
	
	public Double diagonal() {
		return Math.sqrt(width * width + height * height); 
	}	
}
