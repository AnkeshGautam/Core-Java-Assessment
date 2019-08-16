import java.util.ArrayList;

class Orders {
	private String customerName;
	private ArrayList allOrders;
	private int sum;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public ArrayList getAllOrders() {
		return allOrders;
	}
	public void addOrder(Product P) {
		allOrders.add(P);
	}
	public int getSum() {
		return sum;
	}
	public void addSum(int value) {
		sum = sum + value;
	}
	
}