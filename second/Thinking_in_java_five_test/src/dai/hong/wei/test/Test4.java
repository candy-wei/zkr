package dai.hong.wei.test;

/**
 * Date:18/8/27
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Test4 {
    private final int a ;
    private static final int b = 3;
    private final E e;
    private E e1 = new E();
    public Test4(){
        e = e1;
        a = 1;
        System.out.println("initialize ....");
    }

    public static void main(String[] args) {
        Test4 test4 = new Test4();
        test4.e1 = new E();
        System.out.println(test4.e1);
        System.out.println(test4.e);
    }
}
class E{

}