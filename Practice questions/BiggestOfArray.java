// Bigest of Array of 7 Elements
public class BiggestOfArray {
  public static void main(String[] args) {
    int[] arr = { 14, 12, 32, 54, 15, 16, 27 };
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {

      if (arr[i] > max) {
        max = arr[i];
      }

    }
    System.out.println(max);

  }
}
