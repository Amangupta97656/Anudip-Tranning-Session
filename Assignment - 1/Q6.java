//Area and perimeter of a rectangle and square
public class Q6 {
  public static void main(String[] args) {
    int length = 5;
    int breadth = 4;
    int area = length * breadth;
    int perimeter = 2 * (length + breadth);
    System.out.println("Area of rectangle: " + area);
    System.out.println("Perimeter of rectangle: " + perimeter);

    int side = 5;
    int areaSquare = side * side;
    int perimeterSquare = 4 * side;
    System.out.println("Area of square: " + areaSquare);
    System.out.println("Perimeter of square: " + perimeterSquare);

  }

}

/*
 * OUTPUT
 * Area of rectangle: 20
 * Perimeter of rectangle: 18
 * Area of square: 25
 * Perimeter of square: 20
 */