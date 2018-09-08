package dai.hong.wei.test.holding;

import java.util.Map;

/**
 * Date:18/8/31
 * Author: Candy you will like it
 * Desc: for fun
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry entry:
             System.getenv().entrySet()) {
            System.out.println(entry.getKey() + "  "+entry.getValue());
        }
    }
}
