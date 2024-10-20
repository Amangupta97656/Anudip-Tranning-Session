// biggest of three number using conditional operator.
public class Q8 {
  public static void main(String[] args) {
    int a = 10, b = 20, c = 30;
    if (a > b && a > c)
      System.out.println(a + " is the biggest number");
    else if (b > a && b > c)
      System.out.println(b + " is the biggest number");
    else
      System.out.println(c + " is the biggest number");

  }
}
