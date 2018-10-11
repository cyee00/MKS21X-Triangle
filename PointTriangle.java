public class PointTriangle {
  public class Point{
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
  public class Triangle{
    private double x1,x2,x3,y1,y2,y3;
    public Triangle (Point p1, Point p2, Point p3){
      x1=p1.getX();
      x2=p2.getX();
      x3=p3.getX();
      y1=p1.getY();
      y2=p2.getY();
      y3=p3.getY();
    }
    public Triangle (double x1, double x2, double x3, double y1, double y2, double y3){
      x1=x1;
      x2=x2;
      x3=x3;
      y1=y1;
      y2=y2;
      y3=y3;
    }
    public double getPerimeter(){
      distance
    }
  }
}
