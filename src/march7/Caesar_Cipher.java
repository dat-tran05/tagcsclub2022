package march7;

import java.util.Scanner;

public class Caesar_Cipher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int shift = sc.nextInt() % 26;
		sc.nextLine();
		while (sc.hasNextLine()) {
			String s = sc.nextLine();
			for (char c : s.toCharArray()) {
				if (Character.isAlphabetic(c) == false)
					System.out.print(c);
				else {
					int index = c + shift;
					if (Character.isUpperCase(c)) {
						if (index > 90)
							index = index - 'Z' + 'A' - 1;
						else if (index < 65)
							index = index - 'A' + 'Z' + 1;
					} else {
						if (index > 122)
							index = index - 'z' + 'a' - 1;
						else if (index < 97)
							index = index - 'a' + 'z' + 1;
					}
					System.out.print((char) index);
				}
			}
			System.out.println();
		}
	}
}
