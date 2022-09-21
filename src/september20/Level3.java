package september20;

import java.util.Scanner;

public class Level3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total = 0;
		while(in.hasNextInt())
			total += in.nextInt();
		System.out.println(total);
	}
	
}