package quize_2_Jun_2;

public class Question2 {

	public static void main(String[] args) {
		/*
		 * Write a loop that displays all possible combinations of two letters where the
		 * letters are 'z', or 'y', or 'x', or 'w', or 'v'. The combinations should be
		 * displayed in descending alphabetical order:
		 * 
		 * zz 
		 * zy 
		 * zx
		 */
		// WRITE YOUR CODE HERE
		char[] arr = { 'z', 'y', 'x', 'w', 'v' };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i] + "" + arr[j]);
			}
		}
	}
}