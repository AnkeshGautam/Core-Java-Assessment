import java.util.ArrayList;
import java.util.Scanner;

public class ECommerce {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Customer> customerArray = new ArrayList<Customer>();
		ArrayList<Product> productArray = new ArrayList<Product>();
		ArrayList<Orders> orderArray = new ArrayList<Orders>();
		
		while (true) {
			
			System.out.println("1. Register a Customer");
			System.out.println("2. Create a Product");
			System.out.println("3. Create an Order");
			System.out.println("4. View orders");
			System.out.println("5. Exit");
			int firstOption = scanner.nextInt();
			
			switch (firstOption) {
			case 1:
				Customer newCustomer = new Customer();
				System.out.print("Enter Name = ");
				newCustomer.setCustomerName(scanner.next());
				System.out.print("Enter Email = ");
				newCustomer.setCustomerEmail(scanner.next());
				System.out.print("Enter Password = ");
				newCustomer.setPassword(scanner.next());
				customerArray.add(newCustomer);
				System.out.println("Thank you for Registering");
				continue;
			case 2:
				System.out.println("Enter Product Name and Price");
				String name = scanner.next();
				int price = scanner.nextInt();
				Product newProduct = new Product(name,price);
				productArray.add(newProduct);
				continue;
			case 3:
				System.out.println("Enter Email id = ");
				String email = scanner.next();
				System.out.println("Enter password = ");
				String password = scanner.next();
				for(Customer c : customerArray) {
					if(c.getCustomerEmail()==email && c.getPassword()==password)
						createOrder(c.getCustomerName(),productArray,orderArray);
				}
				continue;
			case 4:
				for(Orders order : orderArray) {
					System.out.println(order.getCustomerName());
					System.out.println(order.getAllOrders());
				}
				continue;
			case 5:
				System.out.println("Thank You for Coming");
				break;
			default:
				System.out.println("Invalid Input");
				continue;
			}
		}

	}

	private static void createOrder(String customerName,ArrayList<Product> products,ArrayList<Orders> orders) {
		Scanner sc = new Scanner(System.in);
		Orders order = new Orders();
		order.setCustomerName(customerName);
		for(Product p : products) {
			System.out.print("Do You Want "+p.getProductName()+" yes/no:");
			String ask = sc.next();
			if(ask.equals("yes")) {
				order.addOrder(p);
				order.addSum(p.getPrice());
			}
		}
		
	}

}
