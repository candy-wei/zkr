package cn.itcast.test;

/**
 * Date:18/3/25
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Test1 {
    private static Test1 instance = new Test1();
    private Test1(){}

    public static Test1 getInstance() {
        return instance;
    }

}
