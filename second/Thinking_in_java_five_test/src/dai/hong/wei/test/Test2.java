package dai.hong.wei.test;

/**
 * Date:18/8/26
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Test2 extends Draw{
    Test2(){
        super();
        System.out.println("Test2 Construtor...");
    }
    public static void main(String[] args) {
        Test2 test2 = new Test2();
    }
}
class Art{
    Art(String str){
        System.out.println("Art Constructor..."+str);
    }
}
class Draw extends Art{
    Draw(){
        super("hello word");
        System.out.println("Draw Constructor...");
    }
}