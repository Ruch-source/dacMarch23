package cdac.in.bookstore;

import java.util.Comparator;

public class PublisherComparator implements Comparator<Book>{
	public int compare(Book b1,Book b2) {
		return b1.getPublisher().compareTo(b2.getPublisher());
	}
}
