
/**
 * Tester class
 * @author 
 *
 */
public class BookTester {
	
	/**
	 * The maim method.
	 * @param args
	 */
	 public static void main (String[] args)
	 {
		 
		 //add the code here.
		 
		 Book book;
		 book = new Book("J K Rowling", "Harry Potter", 523);
		 //book.printAuthor();
		 //book.printTitle();
		 //book.printDetails();
		 book.setBorrowed();
		 book.printDetails();
		 
		 /*
		 System.out.println(book.getAuthor());
		 System.out.println(book.getTitle());
		 book.setAuthor("Morgan Dale");
		 book.setTitle("Harry Potter REMASTERED!!!");
		 System.out.println(book.getAuthor());
		 System.out.println(book.getTitle());
		 */
	 }
	 
	 
}