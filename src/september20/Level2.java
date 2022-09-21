package september20;

import java.util.Scanner;

public class Level2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int first = in.nextInt();
		in.nextLine(); //no need to store the result in any variable, since we don't care about it.
		int second = in.nextInt();
		System.out.println(first + second);
	}
	
}