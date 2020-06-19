package quize_1_May_26;

public class InserSort {
public static void main (String [] args) {
 int [] array = {45,12,85,32,89,39,69,44,42,1,6,8};
 int temp;
 for (int i = 1; i < array.length; i++) {
 for (int j = i; j > 0; j--) {
 if (array[j] < array [j - 1]) {
 temp = array[j];
 array[j] = array[j - 1];

 array[j - 1] = temp;
 }
 }
 }
 for (int i = 0; i < array.length; i++) {
 System.out.println(array[i]);
 
 
 }
 
 
 int maxProduct = array[array.length-1]*array[array.length-2];
 System.out.println(maxProduct);
 }
 }