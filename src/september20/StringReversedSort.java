package september20;

import java.util.*;
import java.io.*;
import java.math.*;

public class StringReversedSort {
	public static void main(String[] nutz) throws IOException {
		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine())
		{
			list.add(sc.nextLine());
		}
		Collections.sort(list, Comparator.reverseOrder());
		list.forEach(System.out::println);


		/* My Solution - One Liner
		 * new BufferedReader(new InputStreamReader(System.in)).lines().sorted(Comparator.reverseOrder()).forEachOrdered(System.out::println);
		 */
	}
}