package quize_2_Jun_2;

public class Main { 
	public static void main(String[] args) {
	
  //  System.out.println("Hello world!");
    String sentence =   "I would like to buy a new laptop, because my laptop is too old.";
    appearsTwice( "laptop",  sentence);
    System.out.println( appearsTwice( "laptop",  sentence));
  }
  
  /**
	 * @param target - string that you need to check.
	 * @param sentence - string where you need to lookup for target.
	 * @return
	 * 
	 *  Write a a method appearsTwice() that returns true if value of variable target appears only twice in the string sentence, otherwise return false.
	 *  
	 *  Examples:
Main.appearsTwice("java", "java is fun!") - returns false, because java appears only once.
Main.appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old.") - returns true, because laptop appears twice.
	 */
	public static boolean appearsTwice(String target, String sentence) {
		
		int count = 0;
		String[] strArr = sentence.split(" ");
		
		for(String s : strArr) {
		if (s.contains(",")) {
			s = s.substring(0, s.length()-1);
		}
			if (s.equalsIgnoreCase(target)) {
				count++;
			}
			
		}
		if (count == 2) {
//			System.out.println(s);
			return true;
		}
		

		return false;
	}
}