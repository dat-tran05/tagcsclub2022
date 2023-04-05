package march28;

import java.util.*;
import java.io.*;
import java.math.*;

public class MaxDistance {
	public static void main(String[] nutz) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Point> list = new ArrayList<>();
		for(int i =0 ;i < n; i++) {
			int x = sc.nextInt();
			Point p = new Point(x ,0);
			list.add(p);
		}
		for(int i =0 ;i < n; i++) {
			list.get(i).y = sc.nextInt();
		}
		long max = 0;
		for(int i =0 ;i < n; i++) {
			for(int j = 0; j < n;j++) {
				if(i==j) continue;
				Point first = list.get(i), second = list.get(j);
				int currentDistance = distance(first.x, first.y, second.x, second.y);
				if(max < currentDistance) {
					max = currentDistance;
				}
			}
		}
		System.out.println(max);
		
	}
	public static int distance(int x, int y, int x1, int y1) {
		return (int)(Math.pow(x-x1, 2) + Math.pow(y-y1, 2)); 
	}
}
class Point{
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
}