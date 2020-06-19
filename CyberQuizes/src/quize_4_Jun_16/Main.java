package quize_4_Jun_16;
import java.util.*;
public class Main {
	/*
	 * The method printList gets accepts an ArrayList of ArrayLists and returns it as a string.
Method concatenates all values from each ArrayList and returns it as one. 

			for example:
			printList([["a",b],["c",d]])
			
			returns:"abcd"
	 */
	
	public String printList(ArrayList<ArrayList<String>> nestedList) {
	    String result = "";
		for (int i = 0; i < nestedList.size(); i++) {
			for (int j = 0; j < nestedList.get(i).size(); j++) {
				result += nestedList.get(i).get(j);
			}
			
		}
		return result;
	   
	  }
	  public static void main(String[] args)
	  {
	    Main m = new Main();
	    ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();
	    arr.add(new ArrayList<String>());
	    arr.add(new ArrayList<String>());
	    String[] strs = new String[]{"a","a","b"};
	    Collections.addAll(arr.get(0),strs);
	    
	    strs = new String[]{"z","z","z"};
	    Collections.addAll(arr.get(1),strs);
	    
	    
	    System.out.print(m.printList(arr));
	   
	    
	  }//end main
	}