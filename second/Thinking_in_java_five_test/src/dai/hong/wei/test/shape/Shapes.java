package dai.hong.wei.test.shape;//: typeinfo/Shapes.java
import java.util.*;

abstract class Shape1 {
  void draw() { System.out.println(this + ".draw()"); }
  abstract public String toString();
}

class Circle1 extends Shape1 {
  public String toString() { return "Circle"; }
  public void drawCircle(){
    System.out.println("Circle1.drawCircle()");
  }
}

class Square1 extends Shape1 {
  public String toString() { return "Square"; }
}

class Triangle1 extends Shape1 {
  public String toString() { return "Triangle"; }
}
class Rhomboid extends Shape1{
  public String toString(){ return "Rhomboid";}
  public void drawRhomboid(){
    System.out.println("Rhomboid.drawRhomboid()");
  }
}

public class Shapes {
  public static void main(String[] args) {
    Shape1 shape1 = new Rhomboid();
    shape1.draw();
    Circle1 circle1 = null;
    if (shape1 instanceof Circle1)
      circle1 = (Circle1) shape1;
    else
      System.out.println("Shape1 is not type of Circle.");
  }
} /* Output:
Circle.draw()
Square.draw()
Triangle.draw()
*///:~
