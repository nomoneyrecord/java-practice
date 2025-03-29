import java.util.ArrayList;

public class Customer {
  private int id;
  private String name;
  private ArrayList<Grocery> groceryList;

  public Customer() {
    groceryList = new ArrayList<>();
  }

  public ArrayList<Grocery> getGroceryList() {
    return groceryList; 
  }

  public void addGrocery(Grocery grocery) {
    groceryList.add(grocery);
  }

  public int getId(){
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name; 
  }

  public void setName(String name) {
    this.name = name;
  }
}