package quize_4_Jun_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssessmentTest4_4RemoveEveryOther {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		words.add("hi");
		words.add("yo");
		words.add("sup");
		words.add("yolo");
		words.add("boop");
		words.add("solo");
		words.add("koro");
		words.add("dede");
		//System.out.println(words.toString());
		removeEveryOther(words);
	}

	/*
	 * Create a method that:is called removeEveryOther returns nothing 
	 * takes in a single parameter - an ArrayList of Strings called words
	 This method should take the ArrayList parameter and modify it 
	 by removing every other element in the list, starting with removing the 0th element.

			For example, if the parameter is:
				("hi","yo","sup","yolo","boop")
				The modified ArrayList should be:
				("yo","yolo")
	 */
	
	public static void removeEveryOther(ArrayList<String> words) {
		for (int i = 0; i < words.size(); i=i+1) {
			words.remove(words.get(i));
			
		}
		System.out.println(words.toString());
		
	}
}
