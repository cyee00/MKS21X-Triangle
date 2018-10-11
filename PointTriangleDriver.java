public class Driver {
    public static void main(String[] args) {
    Triangle abc = new Triangle(0, 0, 3, 0, 0, 4); // Initializes a 3-4-5 triangle

    System.out.println(abc); //should print triangle in format specified on website
    System.out.println("\nPerimeter: " + abc.getPerimeter()); //should be 12.0

    System.out.println("\nVertices: " + abc.getVertex(0) + ", " + abc.getVertex(1) + ", " + abc.getVertex(1)); //should print individual vertices

    abc.setVertex(0, new Point(1, 1)); //sets point at the origin to (1,1)

    System.out.println("\nVertex A moved to " + abc.getVertex(0)); //should show new value as (1,1)

    System.out.println("New Perimeter: " + abc.getPerimeter()); //should be approximately 10.39 (truncated)
  }
}


// Driver credits to Tejas Narayan.
