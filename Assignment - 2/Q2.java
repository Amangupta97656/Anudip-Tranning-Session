// compares two integers using all relational operators and print the result.

import java.util.Scanner;

public class Q2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two integers: ");
    int a = input.nextInt();
    int b = input.nextInt();
    System.out.println(a + " > " + b + " is " + (a > b));
    System.out.println(a + " < " + b + " is " + (a < b));
    System.out.println(a + " >= " + b + " is " + (a >= b));
    System.out.println(a + " <= " + b + " is " + (a <= b));
    System.out.println(a + " == " + b + " is " + (a == b));
    System.out.println(a + " != " + b + " is " + (a != b));

  }
}
