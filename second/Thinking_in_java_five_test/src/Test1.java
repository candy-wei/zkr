/**
 * Date:18/8/24
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Test1 {

    Test1(String str){
        System.out.print(str);
    }
}
class TestTest1{

    public static void main(String[] args) {
        Test1[] test;
        test = new Test1[]{new Test1("hello"),new Test1(",world"),};
    }
}