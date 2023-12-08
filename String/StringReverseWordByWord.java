package String;
public class StringReverseWordByWord {

	public static void main(String[] args) {
		String s = "Shubham Dhanave";
		String rev = "";
		String words[] = s.split(" ");
		for (String word : words) {
			for (int i = word.length() - 1; i >= 0; i--) {
				rev = rev + word.charAt(i);
			}
			rev = rev + " ";
		}
		System.out.println(rev);
	}

}
