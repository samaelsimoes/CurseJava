package entities;

public class Product {
	
	public String name;
	public Double price;
	public Integer quantity;
	
	public double totalValueInStock() {		
		return price * quantity;
	}
	
	public void addProducts(Integer quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(Integer quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return name
				+ ", $ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, total: $"
				+ String.format("%.2f", totalValueInStock());
				
	}
}
