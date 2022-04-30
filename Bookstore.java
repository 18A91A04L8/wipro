
import java.util.*;
public class Demobook {

	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter author id ");
       int aid=sc.nextInt();
       System.out.println("Enter author name ");
       String aname=sc.next();
       System.out.println("Enter author generic ");
       String agen=sc.next();
       Author author=new Author();
       author.setAuthorId(aid);
       author.setAuthorName(aname);
       author.setAuthorGeneric(agen);
       System.out.println("Enter book id ");
       int bid=sc.nextInt();
       System.out.println("Enter book name ");
       String bname=sc.next();
       System.out.println("Enter book price ");
       Double price=sc.nextDouble();
       Book book=new Book();
       book.setAuthor(author);
       book.setBookId(bid);
       book.setBookName(bname);
       book.setBookPrice(price);
       System.out.println(book.toString());
	}

}
