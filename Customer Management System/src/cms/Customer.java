package cms;

class Billing{

	private String cardNum;
	private int pinCode;
	private String startDate;
	private String expiryDate;
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
}
public class Customer {
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private int custId;;
	private String firstName;
	private String lastName;
	private Billing billing;
	private String address;
	private String postCode;
	private String phoneNum;
	private String dateOfBirth;
	private String emailAddess;
	
	public Customer(String firstName, String lastName, String phoneNum) {
		this.custId++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address="";
	}	
	
	public String getFullName(){
		return firstName + " " + lastName;
	}
	
	public void printCustomerInfo(){
		System.out.println("ID: "+custId+"\tName: "+firstName + " "+lastName+"\tPhone: "+phoneNum+"\tEmail: "+ emailAddess);
	}

	public Billing getBilling() {
		return billing;
	}

	public void setBilling(Billing billing) {
		this.billing = billing;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
