package dai.hong.wei.test.io;

import java.io.PrintWriter;

/**
 * Date:18/9/7
 * Author: Candy you will like it
 * Desc: for fun
 */
public class ChangeSystemOut {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("hello kitty");
    }
}
