package april4;

import java.util.*;
import java.io.*;
import java.math.*;

public class CrossingTheRiver {
	public static void main(String[] nutz) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), max = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0; i < n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		boolean[] paired = new boolean[n];
		int i = 0, j = n-1;
		int boats = 0;
		while(i < j) {
			if(arr[i] + arr[j] > max) {
				j--;
			}else {
				boats++;
				paired[i] = paired[j] = true;
				i++;
				j--;
			}
		}
		for(boolean b : paired) {
			if(!b) boats++;
		}
		System.out.println(boats);
		
	}
}
/*
4 10
7 2 3 9
*/