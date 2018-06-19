package cms;

import java.util.Scanner;

public class Menu {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int choice = 0;
		boolean quit = false;
		while (!quit) {
			System.out.println("Enter a choice:");
			printMenu();
			if (scanner.hasNextInt()) {
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					addCustomer();
					break;
				case 2:
					updateCustomer();
					break;
				case 3:
					searchCustomer();
					break;
				case 4:
					viewAllCustomers();
					break;
				case 5:
					deleteCustomer();
					break;
				case 6:
					quit = true;
					System.out.println("Goodbye!");
					break;
					default:
						quit=true;
				}
			} else {
				System.out.println("Invalid Input!");
			}				scanner.nextLine();
		}
	}

	private static void searchCustomer() {
		System.out.println("Enter customer name");
		String name = scanner.nextLine();
		if (Data.searchCustomer(name)) {
			System.out.println("Found!");
			Data.findCustomer(name).printCustomerInfo();;
		} else
			System.out.println("Not found in system");
	}

	private static void printMenu() {
		System.out.println("\t 1 - Add Customer");
		System.out.println("\t 2 - Update Customer");
		System.out.println("\t 3 - Search for Customer");
		System.out.println("\t 4 - View All Customer");
		System.out.println("\t 5 - Delete Customer");
		System.out.println("\t 6 - Quit / Exit");
	}

	private static void deleteCustomer() {
		System.out.println("Enter customer Full name");
		String name = scanner.nextLine();
		Customer cust = Data.findCustomer(name);
		if(Data.deleteCustomer(cust)){
			System.out.println(name+ " deleted...");
		}
	}

	private static void viewAllCustomers() {

		for (int i = 0; i < Data.getCustomerData().size(); i++) {
			Data.getCustomerData().get(i).printCustomerInfo();
		}
	}

	private static void updateCustomer() {
	System.out.println("This only updates Customer First Name and Last name so far");
		System.out.println("Enter customer name to update");
		String customerName = scanner.nextLine();

		Customer cust = Data.findCustomer(customerName);
		if (cust!=null){
			System.out.print("Enter new first Name: ");
			String firstName = scanner.nextLine();
			cust.setFirstName(firstName);
			System.out.print("Enter new last Name: ");
			String lastName = scanner.nextLine();
			cust.setLastName(lastName);
		}
			System.out.println("Not found in system");
	}

	private static void addCustomer() {
		System.out.print("Enter customer first Name: ");
		String firstName = scanner.nextLine();
		System.out.print("Enter customer's Last Name: ");
		String lastName = scanner.nextLine();
		Customer tom = new Customer(firstName, lastName, "");
		Data.addCustomer(tom);
	}

}
