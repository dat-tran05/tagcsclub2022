package october4;

import java.util.*;
import java.io.*;
import java.math.*;

public class strings {
	public static void main(String[] nutz) throws IOException {
		Scanner sc = new Scanner(System.in);
		String sock = "sdSSDFple";
//		sock = sock.toLowerCase();
		System.out.println(sock);
		int index = sock.indexOf("SSD");
		System.out.println(sock.charAt(4));
		char[] array = sock.toCharArray();
		System.out.println(Arrays.toString(array));
		String[] arr = sock.split("S");
		System.out.println(Arrays.toString(arr));
		System.out.println(sock.replaceAll("S", "X"));
		
	}
}