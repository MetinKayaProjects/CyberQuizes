package quize_7_Jul07quize_9_July21;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

	    System.out.println("Please enter word:");
	    Scanner scanner = new Scanner(System.in);
	    String n1 = scanner.nextLine();
	    
	    // Your code here
	    //------------------------------------------------
/*
 * Ask user to enter a new password. If the password does not match any of the requirements below, 
 * print a message based on what requirement it is breaking. If it does not break any requirement, print ‘Password accepted’. 


    
Password requirements: 

Be a minimum of eight (8) characters in length 
 
Contain at least one uppercase letter (A-Z) 
 
Contain at least one lowercase letter (a-z) 
 
Contain at least one digit (0-1-2-3-4-5-6-7-8-9) 
 
Contain at least one special character (~`!@#$%^&*()+=_-{}[]\|:;”’?/<>,.) 
 
 */
	    String look = "~`!@#$%^&*()+=_-{}[]\\|:;”’?/<>,.";
	    char [] chars2 = look.toCharArray();

	    char [] chars = n1.toCharArray();

	    boolean found =false;
	    boolean found2=false;
	    boolean found3=false;
	    boolean found4=false;
	    for (int i=0;i<chars.length;i++) {
	    	if (chars[i] < 91 && chars[i] > 64) found=true;
	    }

	    for (int i=0;i<chars.length;i++) {
	    	if (chars[i] < 123 && chars[i] > 96) found2=true;
	    }	    
	    for (int i=0;i<chars.length;i++) {
	    	if (chars[i] < 58 && chars[i] > 47) found3=true;
	    }	 
	    
	    for (int i=0;i<chars.length;i++) {
	    	for (int j=0;j<chars2.length;j++) {
	    		if (chars[i]==chars2[j]) found4=true;
	    }		    
	    }
	    
	    
	    
	    if (n1.length()<8) {
	    	System.out.println("Password should contain minimum 8 characters");
	    }
	    else if (found==false){
	    	System.out.println("Password should contain at least 1 uppercase number");
	    }
	    else if (found2==false){
	    	System.out.println("Password should contain at least 1 lowercase number");
	    }	    
	    else if (found3==false){
	    	System.out.println("Password should contain at least 1 digit");
	    }	    
	    else if (found4==false){
	    	System.out.println("Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]\\|:;”’?/<>,.");
	    }else {
	    	System.out.println("Your password is accepted");
	    }
	    	
	    
	    
	    
	}

}