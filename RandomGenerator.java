import java.util.Random;
import java.util.Scanner;

public class RandomGenerator {
  public static Boolean showResults(Random rand) {
    int randomNum = rand.nextInt(2);
    return randomNum == 1;
  }

  public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      Random rand = new Random(2); 

      int num = scnr.nextInt(); 

      for (int i = 0; i < num; i++) {
        System.out.println(showResults(rand));
      }

      scnr.close();
  }
}

/*
Real-world Use Case Oriented
If you were embedding this logic into something larger, like testing, games, or simulations:

DecisionSimulator

Implies you're randomly making a yes/no, true/false choice — great for games, behavior modeling, or testing logic.

RandomTruthEvaluator

Emphasizes the boolean condition aspect — might be used to simulate truthiness.

CoinFlipSimulator

Because 0/1 → Heads/Tails → True/False is a very common metaphor in games and simulations.

🔹 Abstract / Framework-style
If you were building this as part of a larger framework:

BooleanEngine

RandBoolUtil

BoolStreamGen

🧠 Pro Tip:
Name it based on the context you're using it in.
If it's a standalone utility → RandomBooleanGenerator
If it's part of a game → CoinFlipSimulator
If it's a logic tester → DecisionSimulator
*/