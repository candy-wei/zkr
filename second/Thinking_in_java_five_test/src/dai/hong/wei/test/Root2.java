package dai.hong.wei.test;

/**
 * Date:18/8/28
 * Author: Candy you will like it
 * Desc: for fun
 */
abstract class Root2 {
    abstract void print();
}
class Child1 extends Root2{
    public void print(){
        System.out.println("Child.print()...");
    }
}
class TestRoot2{
    public static void  f(Root2 root2){
        root2.print();
    }

    public static void main(String[] args) {
        f(new Child1());
    }
}