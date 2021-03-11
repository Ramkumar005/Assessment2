package exercise_java;

public class Sum_Array {

	public static void main(String[] args) {

		int[] num = { 1, 3, 2, 5, 4, 7, 6, 9 };
		int total = 0;

		for (int i = 0; i < num.length; i++) {
			total = total + num[i];

		}
		System.out.println(total);

	}
}
