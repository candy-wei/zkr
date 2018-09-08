package dai.hong.wei.test.exceptions;

/**
 * Date:18/9/1
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            throw new Exception("exception info is from Test1 ");
        }catch (Exception e){
            e.printStackTrace(System.out);
        }finally {
            System.out.println("the block has be run anywhere...");
        }
    }
}
