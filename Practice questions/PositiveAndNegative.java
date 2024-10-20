// Find the positive and negative numbers in an array of 10 Elements
public class PositiveAndNegative {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, -6, -7, -8, -9, -10 };
    int positive = 0;
    int negative = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        positive++;
      } else if (arr[i] < 0) {
        negative++;
      }
    }
    System.out.println("Positive numbers: " + positive);
    System.out.println("Negative numbers: " + negative);
  }
}
