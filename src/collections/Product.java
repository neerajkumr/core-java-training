package collections;

public class Product implements Comparable<Product> {

	private int pId;
	private String pName;
	private int quantity;
	private double price;
	public Product(int pId, String pName, int quantity, double price) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.quantity = quantity;
		this.price = price;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", quantity=" + quantity + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Product a1) {
		
		return this.pId-a1.pId;
	}
	
	
	
	
	
}
