package march7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LetterFrequency {

	public static void main(String[] args) throws Throwable {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.lines().map(LetterFrequency::solve).forEach(System.out::println);
	}

	public static String solve(String s) {
		// Bucket Sort -- O(N)
		s = s.toUpperCase().replaceAll("[^A-Z]", "");
		if (s.isEmpty())
			return "";
		Map<String, Integer> map = new LinkedHashMap<>();
		for (String a : s.split(""))
			map.put(a, map.getOrDefault(a, 0) + 1);
		List<String>[] bucket = new List[s.length() + 1];
		for (String key : map.keySet()) {
			int freq = map.get(key);
			if (bucket[freq] == null)
				bucket[freq] = new ArrayList<>();
			bucket[freq].add(key);
		}
		StringBuilder sb = new StringBuilder();
		for (int i = bucket.length - 1; i >= 0; i--) {
			if (bucket[i] != null) {
				List<String> curr = bucket[i];
				for (String g : curr) {
					for (int j = 0; j < i; j++) {
						sb.append(g);
					}
				}
			}
		}
		return sb.toString();
	}
}