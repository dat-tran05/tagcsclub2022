package march28;

import java.util.*;
import java.io.*;
import java.math.*;

public class Triangles {
	public static void main(String[] nutz) throws IOException {
		Scanner sc = new Scanner(System.in);
		int points = sc.nextInt();
		List<Point> list = new ArrayList<>();
		for(int i =0 ;i < points; i++) {
			list.add(new Point(sc.nextInt(), sc.nextInt()));
		}
		int area = 0;
		for(int i =0; i < points; i++) {
			for(int j =0; j < points;j++) {
				for(int k = 0; k < points; k++) {
					Point one = list.get(i), two = list.get(j), three = list.get(k);
					/*
					 * top is k
					 * bot left is i
					 * bot right is j
					 */
					if(one.x == three.x && one.y == two.y) {
						int temp = (two.x - one.x) * (three.y - one.y);
						area = Math.max(area, Math.abs(temp));
					}
				}
			}
		}
		System.out.println(area);
		
	}
	static class Point{
		int x;
		int y;
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
