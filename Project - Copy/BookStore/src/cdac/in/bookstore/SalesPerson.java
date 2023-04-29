package cdac.in.bookstore;
import java.util.Scanner;
import lombok.*;
@Getter
@AllArgsConstructor
public class SalesPerson {
	private int id;
	private String name;
	private long phoneNo;
	private String password;
	static Scanner sc=new Scanner(System.in);
	public String toString() {
		return String.format("%-10d%-10s%-10d",this.id,this.name,this.phoneNo);
	}
	public static int salesSubMenuList() {
		System.out.println("0.Exit");
		System.out.println("1.Add Book");
		System.out.println("2.Search Book");
		System.out.println("3.Update Book Quantity");
		System.out.println("4.Display Books");
		
		System.out.println("Enter choice");
		return sc.nextInt();
	}
}
