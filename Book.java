package practice2;
public class Book {
	private String bookName;
	private Author author;
	private double bookPrice;
	private int bookId;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		if(this.getAuthor().getAuthorGeneric().equals("fictions"))
		{
			this.bookPrice = bookPrice-(0.25*bookPrice);
		}
		else
		{
			this.bookPrice = bookPrice;
		}
		
	}
	
	public  String toString()
	{
		return "Book Name "+this.bookName+" Book Author name "+author.getAuthorName()+" Book author id "+author.getAuthorId()+" Book author generic "+author.getAuthorGeneric()+"Book price "+this.bookPrice;
	}
	
}
