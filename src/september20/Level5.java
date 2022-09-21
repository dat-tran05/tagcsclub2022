package september20;

import java.util.Scanner;


public class Level5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String firstLine = in.nextLine();
		//I don't need the column count, so I only get the row count:
		int rows = Integer.parseInt(firstLine.substring(0, firstLine.indexOf('x')));
		char[][] grid = new char[rows][];
		for(int r = 0; r < rows; r++)
			grid[r] = in.nextLine().toCharArray();
		while(in.hasNextLine()) {
			String line = in.nextLine();
			String[] split = line.substring(1, line.length() - 1)/*gets rid of parentheses*/.split(", ");
			int r = Integer.parseInt(split[0]), c = Integer.parseInt(split[1]);
			System.out.println(grid[r][c]);
		}
	}
	
}