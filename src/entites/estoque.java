package entites;

public class estoque {
	
	public String name;
	public double price;
	public int quantity;

	
	public double totalValueStock() {
		
		double valueTotal = quantity * price;
		return valueTotal;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return name
		+", $"
		+ String.format("%.2f", price)
		+", "
		+ quantity
		+"units, total: $ "
		+String.format("%.2f", totalValueStock());		
		
	}
	
}	
