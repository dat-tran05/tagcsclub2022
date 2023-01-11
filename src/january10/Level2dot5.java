package january10;

import java.io.*;
import java.util.*;

public class Level2dot5 {
    //5 6 7 8 1 2 3 4 
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- > 0){
            int n = sc.nextInt();
            if(n == 1){
                System.out.println(sc.nextInt());
                return;
            }
            int[] arr = new int[n];
            for(int i = 0; i < n;i++){
                int a = arr[i] = sc.nextInt();
            }
            int currentSum = arr[0], maxSum = arr[0];
            for(int i = 1; i < n; i++){
                int a = arr[i-1], b = arr[i];
                if(b != a + 1){
                    maxSum = Math.max(currentSum, maxSum);
                    currentSum = b;
                }else {
                    currentSum+=b;
                }
            }
            System.out.println(Math.max(currentSum, maxSum));
            
        }
    }
}