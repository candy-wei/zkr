package dai.hong.wei.test;

/**
 * Date:18/8/27
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Test5 extends WithFinals{
    public final void f(){
        System.out.println("Test5.f()...");
    }
    private final void ff(){
        System.out.println("Test5.ff()...");
    }

    public static void main(String[] args) {
        Test5 test5 = new Test5();
        test5.f();test5.ff();
    }
}
class WithFinals{
    private final void f(){
        System.out.println("WithFinals.f()...");
    }
    private final void ff(){
        System.out.println("WithFinals.ff()...");
    }
}