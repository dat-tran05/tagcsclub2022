package testing;

import java.util.*;
import java.io.*;
import java. math.*;

public class food {
	public static void main(String[] datt) throws Throwable{
		Scanner sc = new Scanner(new File("src/testing/test2.dat"));
		List<Book> list = new ArrayList<>();
		while(sc.hasNextLine())
			list.add(new Book(sc.nextLine()));
//		Collections.sort(list);
		//sorts the same as the previous example
		list.sort(Comparator.comparing(Book::getAuthor).thenComparing(Comparator.comparing(Book::getGenre)));
		
		list.forEach(System.out::println);
	}
}
class Book
{
	public String author, name, genre;
	public Book(String line)
	{
		String[] arr = line.split("\\*");
		name = arr[0];
		author = arr[1];
		genre = arr[2];
	}
	public String toString()
	{
		return name+ "*" + author + "*" + genre;
	}
	public String getAuthor() {
		return author;
	}
	public String getGenre()
	{
		return genre;
	}
}