package dai.hong.wei.test;

/**
 * Date:18/8/26
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Test3 extends A{
    Test3(int a){
        super(a);
        System.out.println("Test3 Construtor...");
    }
    B b;
    public static void main(String[] args) {
        Test3 test3 = new Test3(2);
    }
}
class A{
    A(int a){
        System.out.println("A Constructor..."+a);
    }
}
class B{
    B(){
        System.out.println("B Constructor...");
    }
}