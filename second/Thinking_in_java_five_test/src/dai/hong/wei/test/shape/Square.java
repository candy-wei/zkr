package dai.hong.wei.test.shape;
import static net.mindview.util.Print.print;

public class Square extends Shape {
  @Override
  public void draw() { print("Square.draw()"); }
  @Override
  public void erase() { print("Square.erase()"); }
  @Override
  public void newfun(){
    System.out.println("square override newfun()...");
  }
} ///:~
