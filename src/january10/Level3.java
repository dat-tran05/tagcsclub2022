package january10;

import java.io.*;
import java.util.*;

public class Level3 {

	public static void main(String[] args) {
		Scanner scanny = new Scanner(System.in);
		int cases = scanny.nextInt();
		while (cases-- > 0) {
			int[] arr = new int[scanny.nextInt()];
			int maxRun = 0;
			int currentRun = 1;
			int startingIndexOfMax = 0;
			arr[0] = scanny.nextInt();
			for (int i = 1; i < arr.length; i++) {
				int newNumber = scanny.nextInt();
				arr[i] = newNumber;
				if (arr[i - 1] + 1 == newNumber)
					currentRun++;
				else {
					if (maxRun == currentRun) {
						if (arr[startingIndexOfMax] < arr[i - currentRun])
							startingIndexOfMax = i - currentRun;
					} else if (Math.max(currentRun, maxRun) == currentRun) {
						maxRun = currentRun;
						startingIndexOfMax = i - currentRun;
					}
					currentRun = 1;
				}
			}
			if (maxRun == currentRun) {
				if (arr[startingIndexOfMax] < arr[arr.length - currentRun])
					startingIndexOfMax = arr.length - currentRun;
			} else if (Math.max(currentRun, maxRun) == currentRun) {
				maxRun = currentRun;
				startingIndexOfMax = arr.length - currentRun;
			}
			int sum = 0;
			for (int i = 0; i < maxRun; i++)
				sum += arr[startingIndexOfMax + i];
			System.out.println(sum);

		}
	}
}
