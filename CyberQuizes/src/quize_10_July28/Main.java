package quize_10_July28;

public class Main {
	public static void main(String[] args) {
		
	}
	public static int missingNumber(int[] arr){
		int totalexp=0;
		int totalact = 0;
		
			totalexp = (1+10)*(10-1+1) / (2*1);
		
		
		for (int i = 0; i < arr.length; i++) {
			totalact +=arr[i];
		}
		
		
	    return totalexp -totalact;
	  }
	  
	}