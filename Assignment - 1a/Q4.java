// calculate the volume of cube, cuboid,cone, cylinder and sphere.

public class Q4 {
  public static void main(String[] args) {
    int length = 5, breadth = 4, height = 3;
    double radius = 3.0, pi = 3.14;
    int side = 4;
    int volumeOfCube = side * side * side;
    int volumeOfCuboid = length * breadth * height;
    double volumeOfCone = (1.0 / 3.0) * pi * radius * radius * height;
    double volumeOfCylinder = pi * radius * radius * height;
    double volumeOfSphere = (4.0 / 3.0) * pi * radius * radius * radius;
    System.out.println("Volume of cube: " + volumeOfCube);
    System.out.println("Volume of cuboid: " + volumeOfCuboid);
    System.out.println("Volume of cone: " + volumeOfCone);
    System.out.println("Volume of cylinder: " + volumeOfCylinder);
    System.out.println("Volume of sphere: " + volumeOfSphere);

  }
}
