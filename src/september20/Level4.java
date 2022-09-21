package september20;

import java.util.Scanner;

public class Level4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String sep = in.nextLine();
        String line = in.nextLine();
        
        String[] strs = line.split(sep);
        int total = 0;
        for(String numStr : strs) {
            int value = Integer.parseInt(numStr);
            total += value;
        }
        
        System.out.println(total);
	}
	
}