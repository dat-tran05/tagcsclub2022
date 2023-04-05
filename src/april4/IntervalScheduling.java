package april4;

import java.util.*;
import java.io.*;
import java.math.*;

public class IntervalScheduling {
	public static void main(String[] nutz) throws IOException {
		Scanner sc = new Scanner(System.in);
		int seg = Integer.parseInt(sc.nextLine());
		List<Segment> list = new ArrayList<>();
		while(seg-- > 0) {
			list.add(new Segment(sc.nextInt(), sc.nextInt()));
		}
		Collections.sort(list);
		int max = 1; 
		int currentTime= list.get(0).end;
		for(int i =1;i < list.size();i++) {
			Segment s = list.get(i);
			if(s.start >= currentTime) {
				max++;
				currentTime = s.end;
			}
		}
		System.out.println(max);
		
	}
}
class Segment implements Comparable<Segment>{
	int start;
	int end;
	public Segment(int start, int end) {
		this.start = start;
		this.end = end;
	}
	public int compareTo(Segment o) {
		return Integer.compare(this.end,  o.end);
	}
}
/*

8
1 4
3 5
0 6
4 7
3 8
5 9
6 10
8 11

*/