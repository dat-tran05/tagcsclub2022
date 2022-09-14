package september13;

import java.io.*;
import java.util.*;
import java.math.*;
public class FractionAddition{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine());
        for(int i = 0;i<cases;i++)
        {
            //for each testcase, take the next line, remove all whitespace, 
            //and divide the line between the "?" into an array
            String[] line = sc.nextLine().replaceAll(" ", "").split("\\?");
            FractionSide left = new FractionSide(line[0]);
            FractionSide right = new FractionSide(line[1]);
            //compares whether left or right is bigger
            int comparison = left.compareTo(right);
            //takes the equality sign based on which side is bigger or equal
            String equality = comparison > 0 ? ">" : comparison < 0 ? "<" : "=";
            System.out.printf("%s %s %s\n", left, equality ,right);
            
            //dumb alternative printing
            // StringJoiner joiner = new StringJoiner(" ");
            // joiner.add(left.toString());
            // joiner.add(equality);
            // joiner.add(right.toString());
            // System.out.println(joiner.toString());
        }
    }
}
class FractionSide{
    private int num,denom;
    public FractionSide(String line)
    {
        //splits the fractions
        String[] variables = line.split("\\+");
        //initializes the first fraction
        String firstFrac = variables[0];
        int top = Integer.parseInt(firstFrac.substring(0, firstFrac.indexOf("/")));
        int bot = Integer.parseInt(firstFrac.substring(firstFrac.indexOf("/")+1));
        int lcm = bot;
        //loops through the rest of the fractions
        for(int i = 1; i < variables.length;i++)
        {
            //takes the fractions and finds the numerator and denominator
            String f1 = variables[i];
            int num1 = Integer.parseInt(f1.substring(0, f1.indexOf("/")));
            int denom1 = Integer.parseInt(f1.substring(f1.indexOf("/")+1));
            //find least common multiple
            lcm = Math.max(lcm,lcm(bot,denom1));
            if(bot == lcm)
            {
                //if the least common multiple is still the current denominator, just add to numerator
                top += num1 * (lcm/denom1);
            }else{
                //convert current fraction to least common multiple
                top = top * (lcm/bot);
                bot = lcm;
                //add the current fraction to numerator
                top += num1 *(lcm/denom1);
            }
        }
        //simplify the fraction with greatest common divisor
        int gcd = gcd(top,bot);
        num = top/gcd;
        denom = bot/gcd;
    }
    public FractionSide(int num, int denom)
    {
        this.num = num;
        this.denom = denom;
    }
    public int compareTo(FractionSide o)
    {
        return Integer.compare(this.num * o.denom, o.num * this.denom);
    }
    public String toString()
    {
        return String.format("%d/%d",num,denom);
    }
    public int gcd(int a, int b) { 
        return b==0 ? a : gcd(b, a%b); 
    }
    public int lcm(int a,int b)
    {
        return Math.abs(a*b)/gcd(a,b);
    }

}