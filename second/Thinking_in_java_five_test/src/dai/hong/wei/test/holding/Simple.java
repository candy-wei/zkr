package dai.hong.wei.test.holding;

import java.util.PriorityQueue;

/**
 * Date:18/8/31
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Simple {
}
class TestSimple{
    private static PriorityQueue<Simple> priorityQueue = new PriorityQueue<>();

    public static void main(String[] args) {
        boolean offer = priorityQueue.offer(new Simple());
        System.out.println(offer);
    }
}