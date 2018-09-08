package dai.hong.wei.test.holding;

import java.util.*;

/**
 * Date:18/8/31
 * Author: Candy you will like it
 * Desc: for fun
 */
public class WordsInfo {
    public static void main(String[] args) {
        Map<String, Integer> wordsMap = new HashMap<>();
        String[] strs = new String[]{"one word","two word","three word","1","one","one word","1"};
        for (String s :
                strs) {
            Integer freq = wordsMap.get(s);
            wordsMap.put(s,freq == null ? 1 : freq + 1);
        }
        List<String> keys = new ArrayList<>(wordsMap.keySet());
        Collections.sort(keys, String.CASE_INSENSITIVE_ORDER);
        for (String key :
                keys) {
            System.out.println(key+"->"+wordsMap.get(key));
        }
        System.out.println(wordsMap);
    }
}
