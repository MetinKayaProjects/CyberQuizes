package quize_2_Jun_2;

public class Question1 {
	public static void main(String[] args) {
		/*
		 * Write a for loop that prints the odd integers 11 through 121 inclusive,
		 * separated by spaces.
		 */
		// WRITE YOUR CODE HERE
		for (int j = 11; j <= 121; j++) {

			if (j % 2 != 0) {
				System.out.print(j + " ");
			}
		}
		System.out.println();

	}
}