/*
5.9 LAB: Sorting user IDs
Given a main() that reads user IDs (until -1), complete the quicksort() and partition() methods to sort the IDs in ascending order using the Quicksort algorithm, and output the sorted IDs one per line.

Ex. If the input is:

kaylasimms 
julia 
myron1994 
kaylajones 
-1
the output is:

julia 
kaylajones
kaylasimms
myron1994 
*/ 

import java.util.Scanner;
import java.util.ArrayList;

public class UserIDSorting {
   // Partition method for quicksort
   public static int partition(ArrayList<String> userIDs, int i, int k) {
      int midpoint = i + (k - i) / 2;
      String pivot = userIDs.get(midpoint);

      int l = i;
      int h = k;
      boolean done = false;

      while (!done) {
         // Move left pointer to the right while element < pivot
         while (userIDs.get(l).compareTo(pivot) < 0) {
            l++;
         }

         // Move right pointer to the left while element > pivot
         while (userIDs.get(h).compareTo(pivot) > 0) {
            h--;
         }

         // If pointers have crossed, stop
         if (l >= h) {
            done = true;
         } else {
            // Swap elements at l and h
            String temp = userIDs.get(l);
            userIDs.set(l, userIDs.get(h));
            userIDs.set(h, temp);

            l++;
            h--;
         }
      }

      return h;
   }

   // Recursive quicksort method
   public static void quicksort(ArrayList<String> userIDs, int i, int k) {
      if (i >= k) {
         return; // Base case: 0 or 1 item
      }

      int pivotIndex = partition(userIDs, i, k);

      // Recursively sort left and right halves
      quicksort(userIDs, i, pivotIndex);
      quicksort(userIDs, pivotIndex + 1, k);
   }

   // Main method to read input and sort
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      ArrayList<String> userIDList = new ArrayList<String>();

      String userID = scnr.next();
      while (!userID.equals("-1")) {
         userIDList.add(userID);
         userID = scnr.next();
      }

      // Initial quicksort call
      quicksort(userIDList, 0, userIDList.size() - 1);

      // Output sorted list
      for (int i = 0; i < userIDList.size(); ++i) {
         System.out.println(userIDList.get(i));
      }
   }
}
