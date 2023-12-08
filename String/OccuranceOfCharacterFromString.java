package String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class OccuranceOfCharacterFromString {

	public static void main(String[] args) {
		String str="abcdaab";
		LinkedHashMap<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
		    Integer val=m.get(c);
			if (val!=null) {
				m.put(c, ++val);
			} else {
				val=1;
				m.put(c,val);
			}
		}
		Set<Map.Entry<Character, Integer>> data = m.entrySet();
		for (Map.Entry<Character, Integer> d : data) {
			System.out.println(d.getKey() + "\t" + d.getValue());
		}
	}

}
