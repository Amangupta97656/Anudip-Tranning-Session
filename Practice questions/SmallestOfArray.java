// Smallest of array of 7 elements
public class SmallestOfArray {
  public static void main(String[] args) {
    int[] arr = { 71, 22, 13, 44, 45, 56, 67 };
    int smallest = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < smallest) {
        smallest = arr[i];
      }
    }
    System.out.println(smallest);
  }
}
