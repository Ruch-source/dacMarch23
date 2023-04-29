package cdac.in.bookstore;
import lombok.*;
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	private String title;
	private String author;
	private String publisher;
	private int price;
	private int quantity;
	
	public String toString() {
		return String.format("%-43s%-20s%-20s%-10d%-8d",this.title,this.author,this.publisher,this.price,this.quantity);
	}
	
	public void displayBook() {
		// TODO Auto-generated method stub
		System.out.println(this.title+"  "+this.price+"Rs");
	}
	
}
