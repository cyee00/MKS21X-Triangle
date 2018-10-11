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
    return null;
    }
    public void setVertex(int i, Point point){
      Point ans;
      if (i==0) {
        p1 = new Point(point.getX(),point.getY());
      }
      if (i==1) {
        p2 = new Point(point.getX(),point.getY());
      }
      if (i==2) {
        p3 = new Point(point.getX(),point.getY());
      }
  }
  public String toString(){
    return "Triangle: A"+p1.toString()+" B:"+p2.toString()+" C:"+p3.toString();
  }
}
