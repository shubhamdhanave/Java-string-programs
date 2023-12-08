package String;

import java.util.Scanner;

public class anagramString {

	public static void main(String[] args) {
		// anagram String means two String contains same character irrespective of its
		// order
		Scanner z = new Scanner(System.in);
		System.out.println("Enter first String");
		String f = z.nextLine();
		System.out.println("Enter Second String");
		String s = z.nextLine();

		if (f.length() == s.length()) {
			// first we have to remove duplicate from each string
			// Removing duplicates from first string
			String ff = "";
			for (int i = 0; i < f.length(); i++) {
				int count = 0;
				for (int j = i + 1; j < f.length(); j++) {
					if (f.charAt(i) == f.charAt(j)) {
						count++;
					}
				}
				if (count == 0) {
					ff = ff + f.charAt(i);
				}
			}
			// Removing duplicates from second string
			String ss = "";
			for (int i = 0; i < s.length(); i++) {
				int count = 0;
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(i) == s.charAt(j)) {
						count++;
					}
				}
				if (count == 0) {
					ss = ss + s.charAt(i);
				}
			}

			// checking that both string contains same characters irrespective of its order
			int count = 0;
			for (int i = 0; i < ff.length(); i++) {
				for (int j = 0; j < ss.length(); j++) {
					if (ff.charAt(i) == ss.charAt(j)) {
						count++;
					}
				}
			}

			// if both String contain same characters irrespective of its order means our
			// count value==string length

			if (count == ff.length() || count == ss.length()) {
				System.out.println("Strings are anagram");
			} else {
				System.out.println("Strings are not anagram");
			}
		} else {
			System.out.println("Strings are not anagram");

		}

	}
}
