// Swap the content of two variables C and D without using third variable
public class Q2 {
  public static void main(String[] args) {
    int a = 10, b = 20;
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("a = " + a + ", b = " + b);

  }
}
