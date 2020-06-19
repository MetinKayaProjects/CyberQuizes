package quize_3_Jun_09;

import java.util.Arrays;

public class ReverseAnArray_3 {
	public static void main(String[] args) {
		
		
		String [] arr = {"apple", "pear", "banana", "ali"};
		System.out.println(Arrays.deepToString(reverse(arr)));
		
		
	}
	 /**
	   * Reverses the order of the elements in the specified array
		 * @param arr
		 * @return array of strings
		 * Example:
					input: ["apple", "pear"]
					output: ["pear", "apple"]
		 */
		
	  public static String[] reverse(String[] arr) {
	    String [] arr1= new String[arr.length];
		 for(int i=arr.length-1; i>=0; i--) {
					  arr1[arr.length-1-i]= arr[i];
				  }
					return arr1;
				}
	}