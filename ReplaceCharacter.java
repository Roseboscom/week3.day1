package week3.assignments;

public class ReplaceCharacter {

	public static void main(String[] args) {
		String sentence = "I am working with Java8";
		String rep = sentence.replace("8", "11");
		System.out.println(rep);
		String substring = rep.substring(5,14);
		System.out.println(substring);

	}

}
