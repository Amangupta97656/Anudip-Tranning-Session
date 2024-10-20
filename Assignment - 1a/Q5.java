// calculate cost of the product after 10 % discount.
public class Q5 {
  public static void main(String[] args) {
    int cost = 100;
    int discount = 10;
    int discountedCost = cost - (cost * discount / 100);
    System.out.println("Discounted cost: " + discountedCost);

  }
}
