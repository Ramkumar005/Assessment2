package exercise_java;

public class TotalCount_Char {

	public static void main(String[] args) {

		String str = "Pulsar";
		System.out.println(str.length());

		System.out.println();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			System.out.println(c);

		}
	}

}
