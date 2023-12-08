package String;

public class MakeFirstLetterCapital {

	public static void main(String[] args) {
		String str="my name is shubham";
		String fcap="";
		String words[]=str.split(" ");
		for(String word:words) {
			String first=word.substring(0,1);
			String second=word.substring(1,word.length());
			String upper=first.toUpperCase();
			fcap=fcap+upper+second+" ";
		}
		System.out.println(fcap);
	}

}
