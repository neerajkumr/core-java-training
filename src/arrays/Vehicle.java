package arrays;

public class Vehicle {
      private int vNumber;
      private String model;
      private double cost;
      private String color;
      
      
	public Vehicle(int vNumber, String model, double cost, String color) {
		super();
		this.vNumber = vNumber;
		this.model = model;
		this.cost = cost;
		this.color = color;
	}
	public int getvNumber() {
		return vNumber;
	}
	public void setvNumber(int vNumber) {
		this.vNumber = vNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "vNumber=" + vNumber + "\nmodel=" + model + "\ncost=" + cost + "\ncolor=" + color + "";
	}
      
      

}
