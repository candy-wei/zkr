package dai.hong.wei.test.holding;

import java.util.*;

/**
 * Date:18/8/30
 * Author: Candy you will like it
 * Desc: for fun
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String , Integer> stringMap = new HashMap<>();
        Map<String , Integer> stringLinkedMap = new LinkedHashMap<>();
        stringMap.put("three", 3);stringMap.put("four", 4);
        stringMap.put("ane", 1);stringMap.put("bwo", 2);
        System.out.println(stringMap);

        String[] keys = stringMap.keySet().toArray(new String[0]);
        Arrays.sort(keys);
        System.out.println(Arrays.toString(keys));
        for (String s:
             keys) {
            stringLinkedMap.put(s , stringMap.get(s));
        }
        System.out.println(stringLinkedMap);
    }
}
