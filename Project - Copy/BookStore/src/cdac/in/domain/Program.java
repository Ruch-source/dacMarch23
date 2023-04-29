package cdac.in.domain;
import java.util.*;
import java.util.Scanner;
import cdac.in.bookstore.*;

public class Program {
	static Scanner sc=new Scanner(System.in);
	private static void updateQuantity(Book book) {
		// TODO Auto-generated method stub
		if(book!=null) {
			System.out.println(book);
			System.out.println("Update quantity of book by:");
			book.setQuantity(sc.nextInt());
		}
		else
			System.err.println("Book Not Found");
	}
	static void displayDetails(Book b) {
		if(b!=null)
			System.out.println(b);
		else
			System.err.println("Book Not Available");
	}
	static Book bookAvailability(Book b) {
		if(b!=null) {
			System.out.println(b);
			System.out.println("Buy Book :(Y|N)");
			if(sc.next().equalsIgnoreCase("y")) {
				
				return b;
			}
			return null;
		}
		else {
			System.err.println("Book Not available");
			return null;
		}
	}
	static Book acceptBook() {
		Book b=new Book();
		sc.nextLine();
		System.out.println("Enter title:");
		b.setTitle(sc.nextLine());
		System.out.println("Enter Author:");
		b.setAuthor(sc.nextLine());
		System.out.println("Enter publisher");
		b.setPublisher(sc.nextLine());
		System.out.println("Enter price:");
		b.setPrice(sc.nextInt());
		System.out.println("Enter Quantity:");
		b.setQuantity(sc.nextInt());
		return b;
	}
	static String acceptBookDetails() {
		sc.nextLine();
		System.out.println("Enter book title");
		return sc.nextLine();
	}
	static int menuList() {
		System.out.println("**********Welcome To Bookstore**************");
		System.out.println("0.Exit");
		System.out.println("1.Customer");
		System.out.println("2.Sales Person");
		System.out.println("3.Manager");
		System.out.println("Enter choice");
		return sc.nextInt();
	}
	static int sortBy() {
		System.out.println("0.Exit");
		System.out.println("1.Sort by Author");
		System.out.println("2.Sort by Publisher");
		System.out.println("Enter choice");
		return sc.nextInt();
	}
	static Customer acceptCustomerRecord() {
		Customer c=new Customer();
		sc.nextLine();
		System.out.println("Enter name:");
		c.setName(sc.nextLine());
		System.out.println("Enter Phone :");
		c.setPhoneNo(sc.nextLong());
		
		c.setId();
		return c;
	}
	public static void main(String[] args) {
		int choice=0;
		int choice2=0;
		int choice3=0;
		int salesChoice=0;
		int managerChoice=0;
		BookStore bs=new BookStore();
		bs.addBook(Inventory.books());
		Comparator<Book> c=null;
		
		while(true){
		try {
			choice=Program.menuList();
			switch(choice) {
				case 0: sc.close();
						return;
				case 1:	Customer customer=Program.acceptCustomerRecord();
						bs.addCustomer(customer);
						Book[] books=new Book[5];
						int index=0;
						while(true) {
						try {
							choice2=Customer.customerMenuList();
							switch(choice2) {
								case 0: 
									break;
								case 1:	Book b=Program.bookAvailability(bs.searchBook(Program.acceptBookDetails()));
										if(b!=null) {
											books[index++]=b;
											System.out.println("Book Added to the cart Successfully");
										}
									break;
								case 2: if(index>0) {
											Orders o=new Orders(books,customer);
											bs.placeOrder(o,customer);
										}
									break;
								case 3:	while(true) {
										try {
											choice3=Program.sortBy();
											switch(choice3) {
												case 0:break;
												case 1: c=new AuthorComparator();
														bs.printBooks(c);
														break;
												case 2: c=new PublisherComparator();
														bs.printBooks(c);
														break;
												default: 
													throw new InputMismatchException();
												}
											}
										catch(InputMismatchException e) {
											System.err.println("Enter valid choice");
											sc.nextLine();
											
										}
										if (choice3 == 0) 
											break;
									}
									
									break;
											
								default: throw new InputMismatchException();
							}
									
							}
						catch(InputMismatchException e) {
							System.err.println("Enter valid choice");
							sc.nextLine();
						}
						if (choice2 == 0) 
							break;	
					}
					break;
						
				case 2:	//sc.nextLine();
//						System.out.println("Enter Password:");
//				       
//						if(BookStore.getSP().getPassword().equals(sc.nextLine())) {
						while(true) {
						try {
							salesChoice=SalesPerson.salesSubMenuList();
							switch(salesChoice) {
								case 0: break;
								case 1: bs.addBook(Program.acceptBook());
										break;
								case 2: Program.displayDetails(bs.searchBook(Program.acceptBookDetails()));
										break;
								case 3: Program.updateQuantity(bs.searchBook(Program.acceptBookDetails()));
										break;
								case 4: while(true) {
										try {
										choice3=Program.sortBy();
										switch(choice3) {
											case 0:break;
											case 1: c=new AuthorComparator();
													bs.printBooks(c);
													break;
											case 2: c=new PublisherComparator();
													bs.printBooks(c);
													break;
											default: throw new InputMismatchException();
											}
										}
										catch(InputMismatchException e) {
											System.err.println("Enter valid choice");
											sc.nextLine();
										}
										if (choice3 == 0) 
				                            break;
									}
									break;
								default:throw new InputMismatchException();
								}
							}
							catch(InputMismatchException e) {
								System.err.println("Enter valid choice:");
								sc.nextLine();
							}
							if (salesChoice == 0)
	                            break;	
						} 	

//						else
//							System.err.println("Invalid Password");
						break;
				case 3:	while(true) {
						try {
							managerChoice=Manager.managerSubMenuList();
							switch(managerChoice) {
								case 0:break;
								case 1:bs.addBook(Program.acceptBook());
									break;
								case 2:Program.displayDetails(bs.searchBook(Program.acceptBookDetails()));
									break;
								case 3:Program.updateQuantity(bs.searchBook(Program.acceptBookDetails()));
									break;
								case 4:bs.printCustomers();
									break;
								case 5:bs.displayOrders();
									break;
								case 6: while(true) {
										try {
										choice3=Program.sortBy();
											switch(choice3) {
											case 0:break;
											case 1: c=new AuthorComparator();
													bs.printBooks(c);
													break;
											case 2: c=new PublisherComparator();
													bs.printBooks(c);
													break;
											default: throw new InputMismatchException();
											}
										}
										catch(InputMismatchException e) {
											System.err.println("Enter valid choice");
											sc.nextLine();
										}
										if (choice3 == 0) 
				                            break;	
									}
									break;
								case 7:System.out.println(BookStore.getSP());
									break;
//								case 8:System.out.println("Total sales: "+Orders.getTotalSales());
//									break;
								default: throw new InputMismatchException();
							}
						}
						catch(InputMismatchException e) {
							System.err.println("Enter Valid Choice");
							sc.nextLine();
						}
						if (managerChoice == 0) 
                            break;    
					}
					break;
				default: throw new InputMismatchException();
				}
			}
			catch(Exception e) {				//Exception Handling
				//e.printStackTrace();
				System.err.println("Enter valid choice");
				sc.nextLine();
			}
		}
	}
	
}
