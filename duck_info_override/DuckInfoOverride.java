import java.util.Scanner;

public class DuckInfoOverride {
  public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      String type, name;

      type = scnr.next();
      name = scnr.next();

      System.out.println("Duck information:");
      
      MallardDuck md = new MallardDuck();

      md.setType(type);
      md.setName(name);

      System.out.println(md.getName() + "the " + md.getType() + " duck " + md.getBehavior() + "!");

      type = scnr.next();
      name = scnr.next();

      RubberDuck rd = new RubberDuck();

      rd.setType(type);
      rd.setName(name);

      System.out.println(md.getName() + "the " + md.getType() + " duck " + md.getBehavior() + "!");
  }
}