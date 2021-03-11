package exercise_java;

public class Copy_1Array_other {

	public static void main(String[] args) {

		int[] num1 = {1,3,5,7,9};
		int[] num2 = new int[num1.length];

		for (int i = 0; i < num1.length; i++) {
			num2[i]=num1[i];

			System.out.println(num2[i]);	
		}

	}

}
