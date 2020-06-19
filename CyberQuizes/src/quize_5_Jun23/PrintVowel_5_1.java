package quize_5_Jun23;

import java.util.Scanner;

public class PrintVowel_5_1 {
	 public static void main(String[] args) {
		    Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String word = inp.nextLine();
		    //write your code below
		    
	/*
	 * Inputs:
String word;

Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs
In: howdyho
oo

In: huehuehuehue
ueueueue

In: poopoo what idk what im doing
ooooaiaioi	    
	 */
		    char[] chrArr = word.toCharArray();
		    String result = "";
		    for (int i = 0; i < chrArr.length; i++) {
		    	if (chrArr[i] == 'a' || chrArr[i] =='e'|| chrArr[i] == 'i' || chrArr[i] == 'o' ||chrArr[i] =='u') {
					result += chrArr[i];
				}
				
			}
		    System.out.println(result);
		    
		  }
		}