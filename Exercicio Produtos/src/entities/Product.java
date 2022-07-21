package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;
	
	public Product() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		this.quantity = 0;
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public double TotalValueInStock(){
		return price*quantity;
	}
	
	public void AddProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void RemoveProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return "Nome: "+name+", Preço: "+String.format("%.2f", price)+", Quantidade: "+quantity+", Valor em estoque: "+String.format("%.2f", TotalValueInStock());
	}
	
}
