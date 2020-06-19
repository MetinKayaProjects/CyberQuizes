package quize_4_Jun_16;

public class Testing {
	public static void main(String[] args) {
		String check = "civic";
		check = check.replace(" ", "").toLowerCase();
		  String reverseCheck = "";
		  int checkTotal = 0;
		  int reverseCheckTotal = 0;
		  //char charArr = Array.toCharacter(check);
		 for (int i = check.length()-1; i >= 0; i--) {
			reverseCheck += check.charAt(i);
			
		}System.out.println(reverseCheck);
		if (check.equalsIgnoreCase(reverseCheck)) {
			System.out.println("Check is palindrome");
		}else {
			System.out.println("is not palondrome");;
		}
	}

}
