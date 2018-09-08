package cn.itcast.test;

/**
 * Date:18/3/25
 * Author: Candy you will like it
 * Desc: for fun
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " -- " + i);
        }
    }
}
