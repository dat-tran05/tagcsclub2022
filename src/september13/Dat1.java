package september13;

import java.io.*;
import java.util.*;
public class Dat1 {
	
	static final class Fraction implements Comparable<Fraction> {
	        
	        private int num,denom;
	        public Fraction(int num, int denom) {
	            int gcd = gcd(num, denom);
	            this.num = num/gcd;
	            this.denom = denom/gcd;
	        }
	        public int gcd(int a, int b) {
	            return b==0 ? a : gcd(b, a%b); 
	        }
	            
	        @Override
	        public int compareTo(Fraction o) {
	            return Integer.compare(num * o.denom, denom * o.num);
	        }
	        
	        @Override
	        public String toString() {
	            return String.format("%d/%d", num, denom);
	        }
	        
	}
	
    public static void main(String[] args) throws Throwable {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.lines().map(Dat1::parse).sorted().forEachOrdered(System.out::println);
    }

    private static Fraction parse(String fractionStr) {
        String[] split = fractionStr.split("/");
        return new Fraction(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
    }
    
}