package cdac.in.bookstore;
import java.util.*;
import java.util.Map.Entry;

public class BookStore {
	private Map<Orders,Customer> map=new HashMap<>();
	private static List<Book> booklist=new ArrayList<>();
	private static List<Customer> customerlist=new ArrayList<Customer>();
	Manager m=new Manager(1002,"John",8723490120l);
	SalesPerson sp=new SalesPerson(101,"rahul",7387428672l);
	void addBook(Book[] b) {
		for(Book book:b)
			booklist.add(book);
	}
	void addBook(Book b) {
		booklist.add(b);
	}
	void printBooks() {
		for(Book b:booklist)
			System.out.println(b);
	}
	void addCustomer(Customer c) {
		if(customerlist!=null) {
			if(customerlist.contains(c))
				System.out.println("Already Registered");
			else
				customerlist.add(c);
		}
	}
	Book searchBook(String name) {
		if(booklist!=null) {
			for(Book b:booklist) {
				if(b.getTitle().equalsIgnoreCase(name) && b.getQuantity()>0) {
					return b;
				}
			}
		}
		return null;
	}
	static void decreseQuantity(Orders o) {
		if(o!=null) {
			Book[] book=o.getBooks();
			for(int i=0;i<book.length;i++) {
				if(book[i]!=null) {
					book[i].setQuantity(book[i].getQuantity()-1);
				
					if(book[i].getQuantity()<1)
						booklist.remove(book[i]);	
				}
			}
		}
	}
	public void placeOrder(Orders o, Customer customer) {
		// TODO Auto-generated method stub
		this.map.put(o, customer);
		if(o!=null && customer!=null) {
			o.displayOrder(customer);
			BookStore.decreseQuantity(o);
		}
		
	
	}
	public void displayOrders() {
	if(this.map!=null) {
			Set<Entry<Orders,Customer>> entries = this.map.entrySet();
			for (Entry<Orders, Customer> entry : entries) {
				Orders key = entry.getKey();
				Customer value = entry.getValue();
				System.out.println("CUSTOMER DETAILS");
				System.out.println("ID :"+value.getId());
				System.out.println("Name:"+value.getName());
				System.out.println("Phone No:"+value.getPhoneNo());
				System.out.println("_____________________________");
				System.out.println("ORDER DETAILS");
				System.out.println("ID: "+key.getId());
				Book[] b=key.getBooks();
				System.out.println("Books:");
				for(Book books:b) {
					if(books!=null) 
						System.out.println(books.getTitle());
				}
				System.out.println("*****************************");
				System.out.println("Total cost:"+key.calculatePrice());
				System.out.println();
				
			}
		}
	}
	void printBooks(Comparator<Book> c) {
		BookStore.booklist.sort(c);
		System.out.println(String.format("%-43s%-20s%-20s%-8s%-8s","Title","Author","Publisher","price","Quantity"));
		BookStore.booklist.forEach(System.out::println);
		
	}
	void printCustomers() {
		if(customerlist!=null)
			BookStore.customerlist.forEach(System.out::println);
	}
	
	
}
