package util;

public class Calculator {
	
	// valor que não posso mudar, nisso utilizo final, valor constante é final
	// constante sempre declarar com letra maiuscula modo mais utilizado
	public final double PI = 3.14159;
	
	public double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}