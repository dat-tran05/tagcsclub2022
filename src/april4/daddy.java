package april4;

import java.util.*;
import java.io.*;
import java.math.*;

public class daddy {
	public static void main(String[] nutz) throws IOException {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();sc.nextLine();
		while(tc-- >0) {
			String[] line = sc.nextLine().split("(?i)i[']?m ");
			System.out.println("Hi " + line[1]+", I'm dad.");
			
		}
	}
}