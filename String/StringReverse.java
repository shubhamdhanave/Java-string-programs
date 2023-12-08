package String;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Shubham Dhanave";
		String reverse = "";
		for (int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println("Reverse String is "+reverse);
	}

}
