package march7;
import java.io.*;
import java.util.*;

public class Level_1 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();
        while(tc-- > 0){
            int words = sc.nextInt(); sc.nextLine();
            String[] array = sc.nextLine().split(" ");
            String findWord = sc.nextLine();
            int count = 0;
            for(String s : array){
                if(s.equals(findWord)) count++;
            }
            System.out.println(count);
        }
        /* My Solution 
	        Scanner sc = new Scanner(System.in);
	        int tc = sc.nextInt();
	        sc.nextLine();
	        while(tc-- > 0){
	            sc.nextLine();
	            List<String> list = Arrays.asList(sc.nextLine().split(" "));
	            System.out.println(Collections.frequency(list,sc.nextLine()));
	        }
        */
       
    }
}