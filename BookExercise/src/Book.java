/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author morgan dale
 * @version 9/2/23
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;

    /**
     * The constructor - set the author and title fields when this object
     * is constructed.
     */
    
    public Book(String bookAuthor, String bookTitle, int newPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = newPages;
        refNumber = "";
        borrowed = 0;
    }
    
    public void setBorrowed() {
    	borrowed += 1;
    }
    
    public int getBorrowed() {
    	return borrowed;
    }
    
    public void setRefNumber(String newRefNumber) {
    	if (newRefNumber.length() >= 3) {
    		refNumber = newRefNumber;
    	}
    	else {
    		System.out.println("Error: The refNumber needs to be more than or equal to 3 characters long.");
    	}
    }
    
    public String getRefNumber() {
    	return refNumber;
    }

    public int getPages() {
    	return pages;
    }
    
    public String getTitle () {
    	return title;
    }
    
    public void setTitle (String newTitle) {
    	title = newTitle;
    }
    
    public String getAuthor () {
    	return author;
    }
    
    public void setAuthor (String newAuthor) {
    	author = newAuthor;
    }
    
    public void printAuthor() {
    	System.out.println("# The book author is " + author);
    }
    
    public void printTitle() {
    	System.out.println("# The book title is " + title);
    }
    
    public void printDetails() {
    	String thisRefNumber = "???";
    	
    	if (refNumber.length() > 0) {
    		thisRefNumber = refNumber;
    	}
    	
    	System.out.println("# Book Details"
    			+ "\n#"
    			+ "\n# Book Title: " + title
    			+ "\n# Book Author: " + author
    			+ "\n# Pages: " + pages
    			+ "\n# Ref Number: " + thisRefNumber
    			+ "\n# Borrowed: " + borrowed);
    }
}
