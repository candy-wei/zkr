package cn.itcast.test;

/**
 * Date:18/3/25
 * Author: Candy you will like it
 * Desc: for fun
 */
public class TestToTest1 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        //Test1 test1 = new Test1();
        Test1 test2 = Test1.getInstance();
        System.out.println("test1："+" test2："+test2);
    }
}
