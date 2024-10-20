// simple interest and compound interest
public class Q3 {
  public static void main(String[] args) {
    int p = 1000;
    int r = 10;
    int t = 5;
    int simpleInterest = (p * r * t) / 100;
    int compoundInterest = (int) (p * Math.pow((1 + r / 100.0), t));
    System.out.println("Simple Interest: " + simpleInterest);
    System.out.println("Compound Interest: " + compoundInterest);
  }
}
