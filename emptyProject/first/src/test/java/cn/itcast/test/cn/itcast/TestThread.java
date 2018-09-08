package cn.itcast.test.cn.itcast;

import cn.itcast.test.MyThread;

/**
 * Date:18/3/25
 * Author: Candy you will like it
 * Desc: for fun
 */
public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyThread());
        thread.start();
        thread.join();
        Thread thread2 = new Thread(new MyThread());
        thread2.start();
    }
}
