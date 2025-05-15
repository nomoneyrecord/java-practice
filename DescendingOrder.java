/* 
5.8 LAB: Descending selection sort with output during execution
Write a void method selectionSortDescendTrace() that takes an integer array, and sorts the array into descending order. The method should use nested loops and output the array after each iteration of the outer loop, thus outputting the array N-1 times (where N is the size). Complete main() to read in a list of up to 10 positive integers (ending in -1) and then call the selectionSortDescendTrace() method.

If the input is:

20 10 30 40 -1
then the output is:

40 10 30 20 
40 30 10 20 
40 30 20 10 
*/

import java.util.Scanner;

public class DescendingOrder {
   // TODO: Write a void method selectionSortDescendTrace() that takes 
   //       an integer array and the number of elements in the array as arguments, 
   //       and sorts the array into descending order.
   public static void selectionSortDescendTrace(int [] numbers, int numElements) {

    for(int i = 0; i < numbers.length - 1; i++) {
      int maxIndex = i; 
      for(int j = i + 1; j < numbers.length; j++) {
        if (numbers[j] > numbers[maxIndex]){
          maxIndex = j; 
        }
      }
      int temp = numbers[maxIndex];
      numbers[maxIndex] = numbers[i]; 
      numbers[i] = temp; 
    }
      
   }
   
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      int input, i = 0;
      int numElements = 0;
      int [] numbers = new int[10];

      // TODO: Read in a list of up to 10 positive integers; stop when
      //       -1 is read. Then call selectionSortDescendTrace() method.

      

   }
}

