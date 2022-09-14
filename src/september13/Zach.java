package september13;

import java.util.*;
import java.io.*;
import java.math.*;

public class Zach {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> values = new ArrayList<>();
        Map<Double, String> map = new TreeMap<>();
        
        while(scan.hasNextLine()){
            String fraction = scan.nextLine();
            fraction = simplifyFraction(fraction);
            int num = Integer.parseInt(fraction.substring(0, fraction.indexOf("/")));
            double denom = Integer.parseInt(fraction.substring(fraction.indexOf("/")+1));
            values.add(num/denom);
            map.put((num/denom), fraction);
            
        }
        Collections.sort(values);
        for(int i = 0; i < map.size(); i++){
            System.out.println(map.get(values.get(i)));
        }
    }
    
    public static String simplifyFraction(String f){
        int num = Integer.parseInt(f.substring(0, f.indexOf("/")));
        int denom = Integer.parseInt(f.substring(f.indexOf("/")+1));
        int gcd = gcd(num, denom);
        
        return (num/gcd) + "/" + (denom/gcd);
        
    }
    
    public static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a%b);
    }

}