package dai.hong.wei.test.holding;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * Date:18/8/31
 * Author: Candy you will like it
 * Desc: for fun
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Double> priorityQueue = new PriorityQueue<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(random.nextDouble());
        }
        printQ(priorityQueue);
    }

    private static void printQ(PriorityQueue<Double> priorityQueue) {
        /*while (priorityQueue.peek() != null){
            Double poll = priorityQueue.poll();
            System.out.print(poll+" ");
        }*/
        // exist a use of this for.
        for(Object data = priorityQueue.poll(); data != null;
            data = priorityQueue.poll())
            System.out.print(data + " ");
        System.out.println();
    }
}
