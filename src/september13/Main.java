package september13;

import java.util.*;
import java.io.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List<Fraction> list = new ArrayList<>();
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            int index = line.indexOf("/");
            String numerator = line.substring(0,index);
            String denom = line.substring(index+1);
            Fraction fraction = new Fraction(Integer.parseInt(numerator), Integer.parseInt(denom));
            list.add(fraction);
        }
        Collections.sort(list);
        for(int i = 0;i <list.size();i++)
        {
            Fraction f = list.get(i);
            System.out.println(f.num + "/" + f.denom);
        }
        
    }
    
    
}
class Fraction implements Comparable<Fraction> 
{
    public int num, denom;
    public Fraction(int num, int denom)
    {
        int gcd = gcd(num,denom);
        this.num = num/gcd;
        this.denom = denom/gcd;
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
    public int compareTo(Fraction o)
    {
        return Integer.compare(this.num * o.denom, this.denom * o.num);
    }
}