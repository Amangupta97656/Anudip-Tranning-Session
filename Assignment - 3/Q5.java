// the year is leap or not. Use the logical operators &amp;&amp; and ||.
public class Q5 {
  public static void main(String[] args) {
    int year = 2000;
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      System.out.println(year + " is a leap year.");
    } else {
      System.out.println(year + " is not a leap year.");
    }

  }
}
