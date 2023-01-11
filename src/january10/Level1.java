package january10;

import java.io.*;
import java.util.*;

public class Level1{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();
        while(tc-- > 0){
            sc.nextLine();
	        String[] line = (sc.nextLine().split(",\\s*")); //", " also works
	        int sum = 0;
	        for(String c : line){
	            sum += c.charAt(0);
	        }
	        System.out.println(sum);
        }
        
    }
}
