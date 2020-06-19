package quize_7_Jul07quize_9_July21;

import java.util.HashMap;
import java.util.Map;

public class TestEPAM {
	public static void main(String[] args) {
		
//		Question
//		Please go through these functions. 
//		Please provide your understanding of these functionalities and issues in them. 
//		Also provide same set of information for these tests too. 

		int a=42; 
		int b=56;
		System.out.println(functionOne(a, b));
		
		
		int[] m = {2,5,8,87};
		
		int[] n = {3,6,11,34,54,12};
		
		System.out.println(functionTwo(m, n));
		
//		Example 1:
	}
	static int functionOne(int a, int b) {
		for(int x = a; x >= 0; x--) {
		if (a % x == 0 && b % x == 0) {
		return x;
		}
		}
		return 1;
		}
		
//		Example 2:
			static Map<Integer, Integer> functionTwo(int[] a, int[] b) {
			Map<Integer, Integer> m = new HashMap<>();
			
			if (a.length <= b.length) {
				for(int i = 0; i < a.length; i++) {
//					m.put(a,b);
					m.put(a[i],b[i]);
				}
			}else {
				for(int i = 0; i < b.length; i++) {
//					m.put(a,b);
					m.put(a[i],b[i]);
				}
			}
			
			return m;
			}

		

		
		
		
	}


