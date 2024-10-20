// compare two Boolean values using logical operators and print the result.

import java.util.Scanner;

public class Q3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first Boolean value: ");
    boolean b1 = sc.nextBoolean();
    System.out.println("Enter second Boolean value: ");
    boolean b2 = sc.nextBoolean();
    if (b1 && b2) {
      System.out.println("Both values are true");
    } else {
      System.out.println("Both values are false");

    }

  }
}
