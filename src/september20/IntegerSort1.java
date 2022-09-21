package september20;

import java.util.*;
import java.io.*;
import java.math.*;

public class IntegerSort1 {
	public static void main(String[] nutz) throws IOException {
		//Simple Solution
		Scanner sc = new Scanner(System.in);
        List<Integer> set = new ArrayList<>();
        while(sc.hasNextLine())
            set.add(Integer.parseInt(sc.nextLine()));
        Collections.sort(set);
        set.forEach(System.out::println);
		/*My Solution - One Liner
        new BufferedReader(new InputStreamReader(System.in)).lines().mapToInt(Integer::parseInt).sorted().forEachOrdered(System.out::println);
        */
	}
}