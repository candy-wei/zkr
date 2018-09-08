package dai.hong.wei.test;

import dai.hong.wei.debug.Debug;

/**
 * Date:18/8/26
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Access {
    public int a =1;
    protected int b = 2;
    int c = 3;
    private int  d = 4;
    public Access(){
        System.out.println("access constructor");
    }
    protected void bite(){
        System.out.println("access.bite()...");
    }

    public static void main(String[] args) {
        Debug debug = new Debug();
    }
}
