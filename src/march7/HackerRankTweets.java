package march7;

import java.io.*;
import java.util.*;

public class HackerRankTweets {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();
        int count = 0;
        while(tc-- > 0){
            String line = sc.nextLine().toLowerCase();
            if(line.contains("hackerrank")) count++;
        }
        System.out.println(count);
    	
    	/* My Solution - One Liner
    	 System.out.println(new BufferedReader(new InputStreamReader(System.in))
    	 .lines().map(String::toLowerCase).filter(n->n.contains("hackerrank")).count());
    	 */
    }
}
