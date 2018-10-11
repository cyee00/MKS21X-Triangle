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
public static double distance(Point p1, Point p2){
  return Math.sqrt((Math.abs(p2.getX()-p1.getX()))*(Math.abs(p2.getX()-p1.getX())) + (Math.abs(p2.getY()-p1.getY()))*(Math.abs(p2.getY()-p1.getY())));
}
public String toString() {
  return "(" + x + "," + y + ")";
}
}
