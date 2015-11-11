package BankBalanceLookup;

public class Customer {

	private String customerID;
	private String lastName;
	private String firstName;
	private double balance;
	public Customer(String customerID, String lastName, String firstName, double balance) {
		this.customerID=customerID;
		this.lastName=lastName;
		this.firstName=firstName;
		this.balance=balance;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	
}
