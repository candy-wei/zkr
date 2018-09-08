package dai.hong.wei.test;

import java.util.Random;

/**
 * Date:18/8/26
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Test1 {
  static Reuse reuse;

    public static void main(String[] args) {
        Random r = new Random(47);
        for (int i = 0; i < 20; i++) {
            System.out.print(r.nextInt(10)+" , ");
        }
    }
}
class Reuse{
   public Reuse(){
        System.out.println("Reuse Constructor...");
    }
}