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
    return Math.sqrt((Math.abs(p1.getX()-this.getX()))*(Math.abs(p1.getX()-this.getX())) + (Math.abs(p1.getY()-this.getY()))*(Math.abs(p1.getY()-this.getY())));
  }
  public double distanceTo(Point p1, Point p2){
    return Math.sqrt((Math.abs(p2.getX()-p1.getX()))*(Math.abs(p2.getX()-p1.getX())) + (Math.abs(p2.getY()-p1.getY()))*(Math.abs(p2.getY()-p1.getY())));
  }
}
}
