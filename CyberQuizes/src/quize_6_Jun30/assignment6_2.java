package quize_6_Jun30;

public class assignment6_2 {
	public static void main(String[] args) {
//		A 2D array is considered "magic" if the following are true:
//			The array is square (N rows and N columns)
//			The sums of each row, the sums of each column, and the sums of each diagonal are all equal.
//
//			Complete the isMagic method so that it will determine whether a given array is magic.
		
		int[][] a = {
				{1,1,1},
				{1,1,1},
				{1,1,1}
			};
			System.out.println(isMagic(a)); //true
			int[][] b = {
				{1,1,2},
				{3,2,3},
				{1,4,1}
			};
			System.out.println(isMagic(b)); //false
			int[][] c = {
				{1,1,1},
				{2,2,2}
			};
			System.out.println(isMagic(c)); //false
			int[][] d = {
				{8,1,6},
				{3,5,7},
				{4,9,2}
			};
			System.out.println(isMagic(d)); //true
		}
		public static boolean isMagic(int[][] array){
			
			int [] sumRows = new int[array.length];
			int [] sumColumn = new int[array.length];
			
			for (int i = 0; i < array.length; i++) {
				
				for (int j = 0; j < array.length; j++) {
					sumRows[i] += array[i][j];					
				}
				for (int k = 0; k < array.length; k++) {
					
					for (int j = 0; j < array.length; j=k-array[k].length-2+j) {
						sumRows[k] += array[k][j];					
					} 
		}
			}
			if (sumColumn.length != sumRows.length) {
				return false;
			}else if (sumColumn == sumRows) {
				return true;
			}
			
			
			return false;
		}
	}