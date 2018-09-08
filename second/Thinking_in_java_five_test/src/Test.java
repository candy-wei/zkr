/**
 * Date:18/8/25
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Test {
    int a;

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();

        t1.a = 9;
        t2.a = 47;

        System.out.println("t1 : "+t1.a+" t2 : "+t2.a);

        t1 = t2;
        System.out.println("t1 : "+t1.a+" t2 : "+t2.a);

        t1.a = 27;
        System.out.println("t1 : "+t1.a+" t2 : "+t2.a);
    }
}
