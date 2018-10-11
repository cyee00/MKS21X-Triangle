public class PointTriangle{
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
}
}
