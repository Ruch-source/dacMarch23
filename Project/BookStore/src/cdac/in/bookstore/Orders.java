package cdac.in.bookstore;
import lombok.*;
@Getter @Setter
public class Orders {
	static int key=0;
	private int id;
	private Book[] books=new Book[5];
	private Customer customer;
	
	Orders() {
		this.id=Orders.key+1;
		Orders.key++;
	}
	Orders(Book[] b, Customer c){ 
		this();
		this.books=b;
		this.customer=c;
	}
	public String toString() {
		return String.format("%-5d", this.id);
	}
	int calculatePrice() {
		int cost=0;
		for(int i=0;i<this.books.length;i++) {
			if(this.books[i]!=null)
				cost+=this.books[i].getPrice();
		}
		return cost;
	}
	void displayOrder(Customer c) {
		System.out.println("***********Bill**********");
		c.displayCustomer(this.customer);
		System.out.println("Order ID:"+this.id);
		for(int i=0;i<this.books.length;i++) {
			if(books[i]!=null)
				this.books[i].displayBook();
		}
		System.out.println("___________________________");
		System.out.println("Total cost: "+calculatePrice());
		System.out.println("**************************");
		
	}
}
