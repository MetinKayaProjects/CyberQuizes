package quize_1_May_26;

import java.util.*;

public class Question_3 {
  public static void main(String[] args) {
	  
	  /*
	   * Given an int num already declared and assigned value.
Check if number is odd or even and print result. 
Please follow the below examples and print message accordingly:

Enter a number: 14
14 is even

Enter a number: 21
21 is odd
	   */
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number:");
    int num = input.nextInt();
   
    //CODE HERE 
    if (num %2 == 0) {
				System.out.println(num + " is even");
			}else {
				System.out.println(num + " is odd");
			}
   
    
  }
}