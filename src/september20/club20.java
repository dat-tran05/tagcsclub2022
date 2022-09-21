package september20;
import java.util.*;
import java.io.*;
import java.math.*;
//did in morning class
public class club20 {
	public static void main(String[] nutz) throws IOException {
		Scanner sc = new Scanner(new File("src/septemeber20/test2.dat"));
		Stack<Books> stack = new Stack<Books>();
		while(sc.hasNextLine())
		{
			String line = sc.nextLine();
			stack.add(new Books(line));
		}
		Collections.sort(stack);
		Collections.reverse(stack);
		stack.forEach(System.out::println);
		
	}
}
class Books implements Comparable<Books>{
	public String title,author,genre;
	public Books(String line)
	{
		String[] arr = line.split("\\*");
		title = arr[0];
		author = arr[1];
		genre = arr[2];
	}
	public int compareTo(Books o)
	{
		int compare = this.author.compareTo(o.author);
		if(compare == 0)
		{
			compare = genre.compareTo(o.genre);
		}
		return compare;
	}
	public String toString()
	{
		StringJoiner joiner = new StringJoiner("*");
		joiner.add(title);
		joiner.add(author);
		joiner.add(genre);
		return joiner.toString();
	}
	
}
