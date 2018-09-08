package dai.hong.wei.test;

/**
 * Date:18/8/27
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Test6 {
    public void f1(){
        f2();
        System.out.println("Test6.f1()...");
    }
    public void f2(){
        System.out.println("Test6.f2()...");
    }
}
class Mouse extends Test6{
    public void f2(){
        System.out.println("Mouse.f2()...");
    }
}
class Hamster{
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.f1();
    }
}