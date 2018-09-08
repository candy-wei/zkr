/**
 * Date:18/8/26
 * Author: Candy you will like it
 * Desc: for fun
 */
class CSDNTest {
    public static void main(String[] args) {
        System.out.println(Child.m);
    }
}
class Super {
    public static int m = 11;
    static {
        System.out.println("z执行了Super静态语句块");
    }
}
class Father extends Super {
    public static int m = 33;
    static {
        System.out.println("z执行了Father静态语句块");
    }
}
class Child extends Father {
    static {
        System.out.println("z执行了Child静态语句块");
    }
}