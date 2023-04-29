package cdac.in.bookstore;

import java.util.Objects;
import java.util.Scanner;

import lombok.*;

//@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	static private int key;
	private int id;
	private String name;
	private long phoneNo;
	static Scanner sc=new Scanner(System.in);
	static {
		key=1000;
	}
	
	public String toString() {
		return String.format("%-10d%-10s%-10d",this.id,this.name,this.phoneNo);
	}

	public int getId() {
		return id;
	}

	public  void setId() {
		this.id = Customer.key+1;
		Customer.key++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public void displayCustomer(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Customer id: "+this.id);
		System.out.println("Customer name: "+this.name);
		System.out.println("************************");
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phoneNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(name, other.name) && phoneNo == other.phoneNo;
	
	}
	public static int customerMenuList() {
		System.out.println("0.Exit");
		System.out.println("1.Buy Book");
		System.out.println("2.Place Order");
		System.out.println("3.display Book");
		
		System.out.println("Enter choice");
		return sc.nextInt();
	}
}
