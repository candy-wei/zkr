package dai.hong.wei.test.concurrency;

/**
 * Date:18/9/9
 * Author: Candy you will like it
 * Desc: for fun
 */
public class ListOff implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("message num:"+i);
            Thread.yield();
        }
    }
}
class Test_Runnable{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new ListOff()).start();
        }
    }
}