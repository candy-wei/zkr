package dai.hong.wei.test.holding;

import java.util.*;

/**
 * Date:18/8/31
 * Author: Candy you will like it
 * Desc: for fun
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> hSet = new HashSet<>();
        Set<String> lSet = new LinkedHashSet<>();
        Collections.addAll(hSet, new String[]{"one","bwo","ahree","aour","five"});
        System.out.println(hSet);
        String[] strs = hSet.toArray(new String[0]);

        Arrays.sort(strs);
        Collections.addAll(lSet, strs);
        System.out.println(lSet);
    }
}
