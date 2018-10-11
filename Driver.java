public class Driver{
    public class Point {
    private double x,y;
    public Point(double X, double Y){
      x=X;
      y=Y;
    }
    public Point(Point p){
      x= p.x;
      y= p.y;
    }
    public double getX(){
      return x;
    }
    public double getY(){
      return y;
    }
    public double distanceTo(Point p1){
      return Math.sqrt((Math.abs(p1.getX()-x))*(Math.abs(p1.getX()-x)) + (Math.abs(p1.getY()-y))*(Math.abs(p1.getY()-y)));
    }
    public double distance(Point p1, Point p2){
      return Math.sqrt((Math.abs(p2.getX()-p1.getX()))*(Math.abs(p2.getX()-p1.getX())) + (Math.abs(p2.getY()-p1.getY()))*(Math.abs(p2.getY()-p1.getY())));
    }
    public String toString() {
      return "(" + x + "," + y + ")";
    }
  }
  public class Triangle {
    private Point p1,p2,p3;
    public Triangle (Point point1, Point point2, Point point3) {
      Point p1 = point1;
      Point p2 = point2;
      Point p3 = point3;
    }
    public Triangle (double x1, double x2, double x3, double y1, double y2, double y3) {
      Point p1 = new Point(x1,y1);
      Point p2 = new Point(x2,y2);
      Point p3 = new Point(x3,y3);
    }
    public double getPerimeter(){
      return p1.distanceTo(p2) + p2.distanceTo(p3) + p3.distanceTo(p1);
    }
    public Point getVertex(int i){
      Point ans;
      if (i==0) {
        ans = new Point(p1.getX(),p1.getY());
      }
      if (i==1) {
        ans = new Point (p2.getX(),p2.getY());
      }
      if (i==2) {
        ans = new Point(p3.getX(),p3.getY());
      }
      return ans;
      }
      public Point setVertex(int i, Point point){
        Point ans;
        if (i==0) {
          p1 = Point(point.getX(),point.getY());
        }
        if (i==1) {
          p2 = Point(point.getX(),point.getY());
        }
        if (i==2) {
          p3 = Point(point.getX(),point.getY());
        }
    }
  }

    public static void main(String[] args) {
    Triangle abc = new Triangle(0, 0, 3, 0, 0, 4); // Initializes a 3-4-5 triangle

    System.out.println(abc); //should print triangle in format specified on website
    System.out.println("\nPerimeter: " + abc.getPerimeter()); //should be 12.0

    System.out.println("\nVertices: " + abc.getVertex(0) + ", " + abc.getVertex(1) + ", " + abc.getVertex(1)); //should print individual vertices

    abc.setVertex(0, new Point(1, 1)); //sets point at the origin to (1,1)

    System.out.println("\nVertex A moved to " + abc.getVertex(2)); //should show new value as (1,1)

    System.out.println("New Perimeter: " + abc.getPerimeter()); //should be approximately 10.39 (truncated)
  }
}


// Driver credits to Tejas Narayan.
