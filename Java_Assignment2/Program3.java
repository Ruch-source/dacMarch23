import java.util.*;
class Book{
    private String title;
    private String author;
    private String publisher;
    private int isbn;
    private int year;
    private int price;
    private int quantity;

    Book(){
        String title=null;
        String author=null;
        String publisher=null;
        int isbn=0;
        int year=0;
        int price=0;
        int quantity=0;
    }

    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPublisher(String publisher){
        this.publisher=publisher;
    }
    public void setIsbn(int isbn){
        this.isbn=isbn;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    
    String getTitle(){
        return this.title;
    }
    String getAuthor(){
        return this.author;
    }
    String getPublisher(){
        return this.publisher;
    }
    int getIsbn(){
        return this.isbn;
    }
    int getYear(){
        return this.year;
    }
    int getPrice(){
        return this.price;
    }
    int getQuantity(){
        return this.quantity;
    }
    int increaseQuantity(int quantity){
        this.quantity+=quantity;
        return getQuantity();
    }
    int decreaseQuantity(int quantity){
        this.quantity-=quantity;
        if(this.quantity<=0)
            setQuantity(0);
                
        return getQuantity();    
    }
    int getInventoryValue(){
        return this.quantity*this.price;
    }

}
class BookTest{
    Book b1=new Book();
    Scanner sc=new Scanner(System.in);
    void acceptRecord(){
        sc.nextLine();
        System.out.println("enter Title     :");
        b1.setTitle(sc.nextLine());
        System.out.println("enter Author    :");
        b1.setAuthor(sc.nextLine());
        System.out.println("enter Publisher   :");
        b1.setPublisher(sc.nextLine());
        System.out.println("enter isbn   :");
        b1.setIsbn(sc.nextInt());
        System.out.println("enter year   :");
        b1.setYear(sc.nextInt());
        System.out.println("enter Price   :");
        b1.setPrice(sc.nextInt());
        System.out.println("enter Quantity   :");
        b1.setQuantity(sc.nextInt());
    }

    void printRecord(){
        System.out.println("Title       :"+b1.getTitle());
        System.out.println("Author      :"+b1.getAuthor());
        System.out.println("Publisher   :"+b1.getPublisher());
        System.out.println("Isbn        :"+b1.getIsbn());
        System.out.println("Year        :"+b1.getYear());
        System.out.println("Price       :"+b1.getPrice());
        System.out.println("Quantity    :"+b1.getQuantity());
        System.out.println("Inventory Value    :"+b1.getInventoryValue());
    }
    void updateQuantity(){
        int choice2;
            while((choice2=quantityMenuList())!=0){
                switch(choice2){
                    case 1: System.out.println("Enter quantity you want add:");
                            b1.increaseQuantity(sc.nextInt());
                            break;
                    case 2: System.out.println("Enter quantity you want reduce:");
                            b1.decreaseQuantity(sc.nextInt());
                            break;
                }
            }
    }
    int quantityMenuList(){
        System.out.println("0.Exit");
        System.out.println("1.Increase Quantity");
        System.out.println("2.Decrease Quantity");
        System.out.println("Enter choice :");
        return sc.nextInt();
    }
    int menuList(){
        System.out.println("0.Exit");
        System.out.println("1.addRecord");
        System.out.println("2.printRecord");
        System.out.println("3.updateQuantity");
        
        System.out.println("Enter choice:");
        return sc.nextInt();

    }
}
class Program3 {
    public static void main(String[] args) {
        BookTest bt1=new BookTest();
        int choice;
        while((choice=bt1.menuList())!=0){
            switch(choice){
                case 1:bt1.acceptRecord();
                        break;
                case 2:bt1.printRecord();
                        break;
                case 3:bt1.updateQuantity();
                        break;
                        
            }
        }
    }
}
