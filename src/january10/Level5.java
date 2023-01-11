package january10;

import java.io.*;
import java.util.*;

public class Level5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        //Solution: Loop Through Array Changing the Left/Rightmost Sums to check parity(if odd)
        while(tc-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int leftS = 0, rightS = 0;
            for(int i =0 ; i < n; i++){
                rightS += arr[i] = sc.nextInt();
            }
            rightS -= leftS = arr[0];
            boolean check = false;
            for(int i = 1; i< n; i++){
                if(rightS * leftS % 2 != 0){
                    check = true;
                    break;
    
                }else{
                    rightS -= arr[i];
                    leftS += arr[i];
                }
            }
            System.out.println(check ? "YES" : "NO");
            
            /*
                Alternative Solution: Checking Number of Odds
	                int n = sc.nextInt();
					int numberOfOdds = 0;
					for(int i=0; i<n;i++)
					{
					    int num = sc.nextInt();
					    if(num%2==1)
					        numberOfOdds++;
					}
					if(numberOfOdds%2==0 && numberOfOdds!=0)
					    System.out.println("YES");
					else
					    System.out.println("NO");
             */
        }
    }
}