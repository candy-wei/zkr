package dai.hong.wei.test;

/**
 * Date:18/8/27
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Ruse {
    public void a(){
        System.out.println("Function a()...");
    }
    public void a(int i){
        System.out.println("Function a(int)...");
    }
    public void a(float f){
        System.out.println("Function a(float)...");
    }
}
class C extends Ruse{
    public void a(String str){
        System.out.println("Fuction a(String)...");
    }
}
class D{
    public static void main(String[] args) {
        C c = new C();
        c.a("hello");
        c.a();
        c.a(1);
        c.a(1.0f);
    }
}