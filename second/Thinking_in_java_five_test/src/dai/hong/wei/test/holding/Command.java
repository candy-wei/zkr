package dai.hong.wei.test.holding;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Date:18/8/31
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Command {
    private String str;
    public void operation(){
        System.out.println(str);
    }
    public Command(String str){this.str = str;}

    public static void main(String[] args) {
        Queue<Command> queue = new LinkedList<>();
        ProduceQ.produce(queue);
        ConsumeQ.consume(queue);
    }
}
class ProduceQ{
    public static void produce(Queue<Command> queue){
        queue.offer(new Command("read"));
        queue.offer(new Command("create"));
        queue.offer(new Command("update"));
        queue.offer(new Command("delete"));
    }
}
class ConsumeQ{
    public static void consume(Queue<Command> queue){
        while (queue.peek() != null)
            queue.remove().operation();

    }
}