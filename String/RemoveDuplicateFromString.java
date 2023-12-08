package String;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		String s = "aabbcc";
		String o = "";
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			if (count == 0) {
				o = o + s.charAt(i);
			}
		}
		System.out.println(o);
	}

}
