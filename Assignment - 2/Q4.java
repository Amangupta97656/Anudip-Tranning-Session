// compare two conditions like 4&gt;7, 10&gt;5 using logicaloperators (&amp;&amp;, ||, !) and print the result.

public class Q4 {
  public static void main(String[] args) {
    int a = 4;
    int b = 7;
    int c = 10;
    int d = 5;
    System.out.println(a > b && c > d);
    System.out.println(a > b || c > d);
    System.out.println(!(a > b && c > d));

  }
}
