//Write the program to interchange the content of two variables C and D 

public class Q2 {
  public static void main(String[] args) {
    int c = 10;
    int d = 20;

    // Swap
    int t = c;
    c = d;
    d = t;

    System.out.println(c);
    System.out.println(d);

  }
}

/*
 * OUTPUT
 * 20
 * 10
 */