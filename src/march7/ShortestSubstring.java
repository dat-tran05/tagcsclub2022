package march7;

import java.util.Scanner;

//WINDOW SLIDING TECHNIQUE
public class ShortestSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		sc.nextLine();
		while (tc-- > 0) {
			String s = sc.nextLine(), v = sc.nextLine();
			if (v.length() > s.length()) {
				System.out.println("none");
				continue;
			}
			System.out.println(solve(s.toCharArray(), v.toCharArray()));
		}
	}

	public static String solve(char[] s, char[] t) {
		int m[] = new int[256];

		// Answer
		int ans = Integer.MAX_VALUE; // length of ans
		int start = 0; // starting index of ans
		int count = 0;
		// creating map
		for (int i = 0; i < t.length; i++) {
			if (m[t[i]] == 0)
				count++;
			m[t[i]]++;
		}

		// References of Window
		int i = 0;
		int j = 0;

		// Traversing the window
		while (j < s.length) {

			// Calculations
			m[s[j]]--;
			if (m[s[j]] == 0)
				count--;

			// Condition matching
			if (count == 0) {
				while (count == 0) {

					// Sorting ans
					if (ans > j - i + 1) {
						ans = j - i + 1;
						start = i;
					}

					// Sliding I
					// Calculation for removing I
					m[s[i]]++;
					if (m[s[i]] > 0)
						count++;

					i++;
				}
			}
			j++;
		}

		if (ans != Integer.MAX_VALUE)
			return String.valueOf(s).substring(start, ans + start);
		else
			return "none";
	}
}
