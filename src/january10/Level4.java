package january10;

import java.io.*;
import java.util.*;

public class Level4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String key = line.substring(0, 2);
			String song = line.substring(3, line.indexOf("(") - 1);
			Key start = new Key(key.charAt(0), Integer.parseInt(key.charAt(1) + ""));
			System.out.print(start + " ");
			String[] scale = song.split(" ");
			// System.out.println(scale);
			for (int i = 0; i < scale.length; i++) {
				String inc = scale[i];
				if (inc.length() == 2) {
					start.incrementDown(Integer.parseInt(inc.charAt(1) + ""));
				} else
					start.incrementUp(Integer.parseInt(inc));
				System.out.print(start + " ");
			}
			System.out.println();
		}

	}
}

class Key {
	char note;
	int octave;

	public Key(char n, int o) {
		note = n;
		octave = o;
	}

	public String toString() {
		return note + "" + octave;
	}

	public void incrementUp(int steps) {
		for (int i = 1; i <= steps - 1; i++) {
			note++;
			if (note == 'H') {
				note = 'A';
			}
			if (note == 'C')
				octave++;
		}
	}

	public void incrementDown(int steps) {
		for (int i = 1; i <= steps - 1; i++) {
			note--;
			if (note == ('A' - 1)) {
				note = 'G';

			}
			if (note == 'B')
				octave--;
		}
	}

}