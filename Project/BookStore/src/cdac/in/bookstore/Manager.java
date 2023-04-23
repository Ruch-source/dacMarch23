package cdac.in.bookstore;
import lombok.*;
@AllArgsConstructor
public class Manager {
	private int id;
	private String name;
	private long phoneNo;
	
	public String toString() {
		return String.format("%-10d%-10s%-10l",this.id,this.name,this.phoneNo);
	}
}
