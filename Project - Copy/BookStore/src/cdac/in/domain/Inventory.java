package cdac.in.domain;

import java.util.Scanner;
import cdac.in.bookstore.*;
public class Inventory {
	static Scanner sc=new Scanner(System.in);
	static Book[] books() {
		Book [] book=new Book[15];
		book[0]=new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling","Bloomsbury",1200,10);
		book[1]=new Book("the alchemist","paulo cohelo","xxx",400,5);
		book[2]=new Book("three states","Chetan bhagat","xxx",500,60);
		book[3]=new Book("Shrimanyogi","Ranjit Desai","YYY",1000,7);
		book[4]=new Book("Pride and Prejudice", "Jane Austen", "Penguin Classics",400,20);		
		book[5]=new Book("The Lord of the Rings","J.R.R. Tolkien", "Houghton Harcourt",900,10);
		book[6]=new Book("Da Vinci Code","Dan Brown", "Doubleday",600,4);
		book[7]=new Book("The Fault in Our Stars","John Green", "Dutton Books",300,10);
		book[8]=new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling", "Bloomsbury",700,3);
		book[9]=new Book("Five Point Someone","Chetan Bhagat", "Rupa Publications",350,7);
		book[10]=new Book("Revolution 2020","Chetan Bhagat","Rupa Publications",450,9);
		book[11]=new Book("Half Girlfriend", "Chetan Bhagat", "Rupa Publications",600,5);
		book[12]=new Book("Wings of Fire","APJ Abdul Kalam", "Press India",650,1);
		book[13]=new Book("Ignited Minds","APJ Abdul Kalam", "Penguin India",600,13);
		book[14]=new Book("Zero to One","Peter Thiel","Crown Buiseness",480,2);
		return book;
		
	}
	
}
