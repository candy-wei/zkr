package dai.hong.wei.test;

/**
 * Date:18/8/27
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Insect {
    private int i = 9;
    protected int j;
    Insect(){
        System.out.println("i = "+i + " j = "+j);
        j = 39;
    }
    private static int x1 = printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}
class Beetle extends Insect{
    private int k = printInit("Beele.k initialized");
    public Beetle(){
        System.out.println("k : "+k);
    }
    private static  int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        System.out.println(" go go go");
        Beetle beetle = new Beetle();

    }
}