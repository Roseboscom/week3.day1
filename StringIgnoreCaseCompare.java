package week3.assignments;

public class StringIgnoreCaseCompare {

	public static void main(String[] args) {
		String str1 = "I am Learning Java";
		String str2 = "I am learning java";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("Exploring ==");

		if (str1 == str2)

			System.out.println("Both strings are same");
		else
			System.out.println("Both strings are not same");

		System.out.println("Exploring equals");

		if (str1.equals(str2))

			System.out.println("Both strings are same");
		else
			System.out.println("Both strings are not same");

		System.out.println("Exploring equalsignorecase");

		if (str1.equalsIgnoreCase(str2))

			System.out.println("Both strings are same");
		else
			System.out.println("Both strings are not same");
	}

}
