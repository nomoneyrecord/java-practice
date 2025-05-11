import java.util.LinkedList;
import java.util.Scanner;

public class ShoppingList {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);

      // TODO: Declare a LinkedList called shoppingList of type ListItem

      LinkedList<ListItem> shoppingList = new LinkedList<ListItem>(); 

      String items = scnr.nextLine();
      
      // TODO: Scan inputs (items) and add them to the shoppingList LinkedList
      //       Read inputs until a -1 is input

      while(!items.equals("-1")) {
        shoppingList.add(new ListItem(items));
        items = scnr.nextLine(); 
      }
     
      
      // TODO: Print the shoppingList LinkedList using the printNodeData() method
    
      for (ListItem listItem : shoppingList) {
        listItem.printNodeData();
      }
   }
}