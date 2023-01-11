package january10;

import java.io.*;
import java.util.*;

public class Level2{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int cur = 1, max = 1;
            for(int i = 0; i < n;i++){
                int a = arr[i] = sc.nextInt();
            }
            for(int i =0 ; i < n - 1 ; i++){
                int a = arr[i], b = arr[i+1];
                if(b != a + 1){
                    max = Math.max(max, cur);
                    cur = 1;
                }else cur++;
            }
            System.out.println(Math.max(max, cur));
        }
    }
}