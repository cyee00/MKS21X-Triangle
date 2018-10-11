public class Triangle{
  private double x1,x2,x3,y1,y2,y3;
  public Triangle(Point p1, Point p2, Point p3){
    x1=p1.getX();
    x2=p2.getX();
    x3=p3.getX();
    y1=p1.getY();
    y2=p2.getY();
    y3=p3.getY();
  }
  public Triangle(double x1, double x2, double x3, double y1, double y2, double y3){
    x1=x1;
    x2=x2;
    x3=x3;
    y1=y1;
    y2=y2;
    y3=y3;
  }
  /*public double getPerimeter(){
    distance
  }*/
}
