import java.util.*;
public class Book {
	static String title;
	static String author;
	static int publishedYear;
	Book(String title,String author, int publishedYear)
	{
		Scanner sc=new Scanner(System.in);
		title=sc.nextLine();
		author=sc.nextLine();
		publishedYear=sc.nextInt();
		displayDetails(title,author,publishedYear);
	}
	public void displayDetails(String title,String author, int publishedYear)
	{
System.out.println("Title: "+ title);
System.out.println("Author: "+ author);
System.out.println("Published year: "+ publishedYear);

	}
public static void main(String args[])
{
	
	Book details = new Book(title,author,publishedYear);
	
}
}
