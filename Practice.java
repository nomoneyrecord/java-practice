

//Practice with Alexi based on zylabs curriculum

public class Practice {
  public static void main (String[] args) {
    int num1 = 10;
    int num2 = 3;

    Calculate calc = new Calculate(); 

    int addResult = calc.add(num1, num2);
    int subtractResult = calc.subtract(num1, num2);
    int multiplyResult = calc.multiply(num1, num2);
    int divideResult = calc.divide(num1, num2);
    int modulusResult = calc.modulus(num1, num2);

    System.out.println("Addition: " + addResult);
    System.out.println("Subtraction: " + subtractResult);
    System.out.println("Multiplication: " + multiplyResult);
    System.out.println("Division: " + divideResult);
    System.out.print("Modulus: " + modulusResult);
  }
}

