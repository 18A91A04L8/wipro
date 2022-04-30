package practice;

public class Book {
	String bookname;
	double bookprice;
	String bookauthor;
	String bookgenre;
	
	void bookinfo()
	{
		
		double newprice=0.0;
		if(bookgenre=="fiction") {
			newprice=discount(bookprice);
			System.out.println("discounted price: "+newprice);
		}
	}
	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public double getBookprice() {
		return bookprice;
	}

	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}

	public String getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	public String getBookgenre() {
		return bookgenre;
	}

	public void setBookgenre(String bookgenre) {
		this.bookgenre = bookgenre;
	}

	double discount(double p) {
		return (75*p)/100;
	}

	

}