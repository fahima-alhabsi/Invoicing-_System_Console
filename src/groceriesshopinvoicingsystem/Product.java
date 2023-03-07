package groceriesshopinvoicingsystem;

public class Product {
	
	private int ID;
	private String Name;
	private  double unitPrice;
    private int quantity;
    private double quantityAmount;
    public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getQuantityAmount() {
		return quantityAmount;
	}
	public void setQuantityAmount(double quantityAmount) {
		this.quantityAmount = quantityAmount;
	}
	
	
}


