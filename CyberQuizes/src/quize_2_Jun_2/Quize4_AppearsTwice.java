package quize_2_Jun_2;

public class Quize4_AppearsTwice {
	public static void main(String[] args) {
//		Assessment test #2. 4 - Appears twice
		/*
		 * Write a a method appearsTwice() that returns true if value of variable target
		 * appears only twice in the string sentence, otherwise return false.
		 * 
		 * Examples:
Main.appearsTwice("java", "java is fun!") - returns false, because java appears only once.
Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.") - returns true, because laptop appears twice.
 */
		  String sentence =   "I would like to buy a new laptop, because my laptop is too old.";
		    appearsTwice( "laptop",  sentence);
		    System.out.println( appearsTwice( "laptop",  sentence));

	}
	public static boolean appearsTwice(String target, String sentence) {
		int count = 0;
		String [] str = sentence.split(" ");
		
		for(String s : str) {
			if (s.contains(",")) {
				s = s.substring(0,s.length()-1);
			}
			if (s.equalsIgnoreCase(target)) {
				count++;
			}
			if(count == 2) {
				return true;
			}
		}
		
			
			
		return false;
	}

}
