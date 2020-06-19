package quize_7_Jul07quize_9_July21;

public class Test {
	public static void main(String[] args) {

		/*
		 * Complete the mystery method so that it takes in an integer array as a
		 * parameter, and then modifies each element based on whether it's even or odd.
		 * If the number is even, divide it by 2. If it's odd, multiply it by 10.
		 */

		int[] a = { 1, 2, 3, 4, 5 };
		mystery(a);
		for (int e : a) {
			System.out.print(e + " ");
		}
		// should print out 10 1 30 2 50
	}

	public static void mystery(int[] array) {
		
		//If the number is even, divide it by 2. 
		//If it's odd, multiply it by 10.
		
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2 ==0) {
				array[i] = array[i]/2;
			}else {
				array[i] = array[i]*10;
			}
		}
		
		

	}
}