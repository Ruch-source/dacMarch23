package cdac.in.bookstore;
import java.util.Scanner;

import lombok.*;
@AllArgsConstructor
public class Manager {
	private int id;
	private String name;
	private long phoneNo;
	static Scanner sc=new Scanner(System.in);
	public String toString() {
		return String.format("%-10d%-10s%-10l",this.id,this.name,this.phoneNo);
	}
	public static int managerSubMenuList() {
		System.out.println("0.Exit");
		System.out.println("1.Add Book");
		System.out.println("2.Search Book");
		System.out.println("3.Update Book Quantity");
		System.out.println("4.Display Customers");
		System.out.println("5.Display Orders");
		System.out.println("6.Display Books");
		System.out.println("7.Display Sales Person Info");
		//System.out.println("8.Display Sales Report");
		
		System.out.println("Enter choice");
		return sc.nextInt();
	}
}
