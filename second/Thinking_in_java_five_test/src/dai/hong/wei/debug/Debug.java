package dai.hong.wei.debug;

/**
 * Date:18/8/26
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Debug {
    public static void debug(String[] strs){
        for (String str :
                strs) {
            System.out.println(str);
        }
    }
    public Debug(){
        System.out.println("Debug constructor...");
    }
}
