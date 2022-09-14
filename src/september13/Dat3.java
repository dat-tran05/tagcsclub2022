package september13;

import java.io.*;
import java.util.*;

public class Dat3 {
	
	
	
	public static void main(String[] args) throws Throwable {
		Scanner scanner = new Scanner(System.in);
		List<Fraction1> Fraction1s = new ArrayList<>(); 
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine(); //this is the next line of input, as a String.
			Fraction1s.add(parse(line));
		}
		
		Collections.sort(Fraction1s); //It knows how to sort my List of Fraction1s because I made the Fraction1 class
		//implement the Comparable interface. If Fraction1 did not implement Comparable, this line would give a compile
		//error.
		
		for(Fraction1 f : Fraction1s)
			System.out.println(f); //this calls the toString() method on f, so it will be formatted correctly.
	}

	private static Fraction1 parse(String Fraction1Str) {
		//See Sam1 and Sam2 for an easier way to do this method.
		int slashIndex = Fraction1Str.indexOf('/');
		int num = Integer.parseInt(Fraction1Str.substring(0, slashIndex));
		int denom = Integer.parseInt(Fraction1Str.substring(slashIndex + 1));
		return new Fraction1(num, denom);
	}
	
}

class Fraction1 implements Comparable<Fraction1> {
	
	private final int num, denom;
	
	Fraction1(int num, int denom) {
		int gcd = gcd(num, denom);
		num /= gcd;
		denom /= gcd;
		this.num = num;
		this.denom = denom;
	}
	public int gcd(int a, int b)
	{
		while(b != 0)
		{
			int temp = b;
			b = a%b;
			a = temp;
		}
		return a;
	}
	@Override
	public int compareTo(Fraction1 o) {
		//You can compare two Fraction1s, a/b and c/d, by simply comparing the products a*d and b*c. This can be proven
		//by simple algebra. If you multiply both sides of the inequality by b*d:
		//		a/b > c/d  =>  ad > bc
		//You can do the same for less than (<) and equals (=).
		
		//I am leveraging the fact above in this line. This line is basically saying "the comparsion of this Fraction1
		//and o is the same as the comparison of num*o.denom and denom*o.num."
		return Integer.compare(num * o.denom, denom * o.num);
	}
	
	@Override
	public String toString() {
		return num + "/" + denom; //see Sam1 and Sam2 to for the way I would do this statement :)
	}
	
}