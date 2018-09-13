package dai.hong.wei.test.concurrency;

/**
 * Date:18/9/9
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Fibonacci implements Runnable {
    private final int n;
    private int count;
    public Fibonacci(int n){this.n = n;}
    public Integer next() { return fibonacci(count++); }
    @Override
    public void run() {
        if ( n <= 0){
            System.out.println("illegal arguments");
        }
        StringBuilder sb = new StringBuilder("fibonacci : ");
        for (int i = 1; i <= n; i++) {
            sb.append(fibonacci(i)+",");
        }
        sb.delete(sb.length() - 1, sb.length());
        System.out.println(sb.toString());
    }
    private int fibonacci(int n){
        if (n < 2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        Integer next = new Fibonacci(10).next();
        System.out.println(next);
        /*for (int i = 3; i <= 6;) {
            new Thread(new Fibonacci(i)).start();
            i++;
        }*/
    }
}
