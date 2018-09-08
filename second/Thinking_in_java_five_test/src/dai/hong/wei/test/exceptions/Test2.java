package dai.hong.wei.test.exceptions;

/**
 * Date:18/9/1
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            throw new MyException1("exception is from Test2");
        }catch (MyException1 e){
            e.showInfo();
        }
    }
}
