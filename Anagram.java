package Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Anagram {

	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		System.out.println("Enter String 1 =>");
		String str1 = o.next();
		System.out.println("Enter String 2 =>");
		String str2 = o.next();
		int rv = check(str1, str2);
		System.out.println("Result =>");
		if (rv == 1) {
			System.out.println("ANAGRAM");
		} else {
			System.out.println("NOT ANAGRAM");
		}
	}

	public static int check(String str1, String str2) {
		if (str1.length() < str2.length() || str2.length() < str1.length() || str1.length() > str2.length()
				|| str2.length() > str1.length()) {
			return 0;
		} else {
			HashMap<Character, Integer> map1 = new HashMap<>();
			HashMap<Character, Integer> map2 = new HashMap<>();

			for (int i = 0; i < str1.length(); i++) {
				char cc = str1.charAt(i);
				if (map1.containsKey(cc)) {
					int ov = map1.get(cc);
					int nv = ov + 1;
					map1.put(cc, nv);
				} else {
					map1.put(cc, 1);
				}
			}

			for (int j = 0; j < str2.length(); j++) {
				char cc = str2.charAt(j);
				if (map2.containsKey(cc)) {
					int ov = map2.get(cc);
					int nv = ov + 1;
					map2.put(cc, nv);
				} else {
					map2.put(cc, 1);
				}
			}
			Set<Map.Entry<Character, Integer>> entries1 = map1.entrySet();
			for (Map.Entry<Character, Integer> entry : entries1) {
				char ch = entry.getKey();
				if (map2.containsKey(ch)) {
					if (map2.get(ch) != entry.getValue()) {
						return 0;
					}

				} else {
					return 0;
				}
			}

			return 1;

		}

	}

}
