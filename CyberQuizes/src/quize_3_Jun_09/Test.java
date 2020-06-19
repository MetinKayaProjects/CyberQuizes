package quize_3_Jun_09;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {

		 /**
		   * Reverses the order of the elements in the specified array
			 * @param arr
			 * @return array of strings
			 * 
			 */
		String [] arr = {"apple", "pear", "banana", "ali"};
		System.out.println(Arrays.deepToString(reverse(arr)));
	}
		
		  public static String[] reverse(String[] arr) {
			String temp = arr[0];
			  for (int i = 0; i < arr.length; i++) {
				temp = arr[i];
				arr[i] = arr[arr.length-1];
				arr[arr.length-1]=temp;
			}
				
						return arr;
			}
		}