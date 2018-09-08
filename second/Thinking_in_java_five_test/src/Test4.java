import dai.hong.wei.test.Access;

/**
 * Date:18/8/26
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Test4 extends Access{
    public Test4(){
        System.out.println("Test4 constructor...");

    }
    public void chomp (){
        bite();
    }
    public static void main(String[] args) {
        Test4 test4 = new Test4();
        System.out.println(test4.a);
        System.out.println(test4.b);
        test4.chomp();

    }
}
