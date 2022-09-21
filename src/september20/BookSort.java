package september20;

import java.util.*;
import java.io.*;
import java.math.*;
//When you're using Comparator.comparing, there's no need to implement Comparable since you're already stating what is being compared
public class BookSort {
	public static void main(String[] datt) throws Throwable{
        Scanner sc = new Scanner(System.in);
        List<Book> list = new ArrayList<>();
        while(sc.hasNextLine())
            list.add(new Book(sc.nextLine()));
        Collections.sort(list);
        //sorts the same as the previous example
//        list.sort(Comparator.comparing(Book::getAuthor).thenComparing(Comparator.comparing(Book::getGenre)));
        
        list.forEach(System.out::println);
        //one liner solution
        /*
         * new BufferedReader(new InputStreamReader(System.in)).lines().map(Book::new).sorted(Comparator.comparing(Book::getAuthor).thenComparing(Comparator.comparing(Book::getGenre))).forEachOrdered(System.out::println);
         */
    }
}
class Book implements Comparable<Book>
{
    public String author, name, genre;
    public Book(String line)
    {
        String[] arr = line.split("\\*");
        name = arr[0];
        author = arr[1];
        genre = arr[2];
    }
    public int compareTo(Book o)
    {
    	int compare = author.compareTo(o.author);
    	compare = compare == 0 ? genre.compareTo(o.genre): compare;
    	return compare;
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
