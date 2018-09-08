package dai.hong.wei.test.exceptions;

/**
 * Date:18/9/1
 * Author: Candy you will like it
 * Desc: for fun
 */
public class MyException1 extends Exception {
    private String s;
    public MyException1(String str){
        s = str;
    }
    public void showInfo(){
        System.out.print(s);
    }
}
