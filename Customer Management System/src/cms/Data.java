package cms;

import java.util.ArrayList;

public class Data {
	private static ArrayList<Customer> customerData = new ArrayList<Customer>();

	public static ArrayList<Customer> getCustomerData() {
		return customerData;
	}

	public static void addCustomer(Customer customer) {
		customerData.add(customer);
	}

	public static boolean searchCustomer(String fullName) {
		for (int i = 0; i < customerData.size(); i++) {
			if (customerData.get(i).getFullName().equals(fullName)) {
				return true;
			}
		}
		return false;
	}


	public static int findCustomer(Customer customer) {
		for (int i = 0; i < customerData.size(); i++) {
			if (customer == customerData.get(i)) {
				return i;
			}
		}
		return -1;
	}
	
	public static Customer findCustomer(String customerFullName) {
		for (int i = 0; i < customerData.size(); i++) {
			if (customerFullName.equals(customerData.get(i).getFullName())) {
				return customerData.get(i);
			}
		}
		return null;
	}

	public static boolean deleteCustomer(Customer customer) {
		int i = 0;
		while (i < customerData.size()) {
			int customerLoc = findCustomer(customer);
			if (customerLoc >= 0) {
				customerData.remove(customerLoc);
				return true;
			}
			break;
		}
		return false;
	}

	public static void viewAllCustomers() {
		int index = 0;
		while (index < customerData.size()) {
			System.out.println(customerData.get(index).getFullName());
			index++;
		}
	}
}
