// two numbers as input and calculate their sum, difference, product, quotient and remainder using arithmetic operators.

import java.util.Scanner;

public class Q1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Sum is " + (a + b));
    System.out.println("Difference is " + (a - b));
    System.out.println("Product is " + (a * b));
    System.out.println("Quotient is " + (a / b));
    System.out.println("Remainder is " + (a % b));
  }
}