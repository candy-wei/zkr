package dai.hong.wei.test.holding;

import java.util.*;

/**
 * Date:18/8/30
 * Author: Candy you will like it
 * Desc: for fun
 */
public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        Collections.addAll(words,"addAll contains".split(" "));
//        words.addAll(new TextFile("SetOperations.java","\\W+"));
        System.out.println(words);
        Character[] ch = new Character[]{'a','e','i','o','u','A','E','I','O','U'};
        Set<Character> vowels = new TreeSet<>();
        Collections.addAll(vowels,ch);
//        Iterator<Character> vowelIterator = vowels.iterator();
        Map<Character, Integer> map = new HashMap<>();
        Iterator<String> wordsIterator = words.iterator();
        int sum = 0;
        while (wordsIterator.hasNext()){
            int count = 0;
            String str = wordsIterator.next();
            //Set的性质
            char[] chars = str.toCharArray();
            for (char c :
                    chars) {
                if (vowels.contains(c)){
                    //很多种实现的方法，只是，要找到比较合适的实现，还是得多熟悉javaAPI文档！！！
                    Character cha = Character.toLowerCase(c);
                    Integer freq = map.get(cha);
                    map.put(cha, freq == null ? 1 : freq + 1);
                    count++;
                }
            }
            System.out.println(str+"含有"+count+"个元音字母。");
            sum += count;
        }
        System.out.println("该文件中所有元音字母的数量总和：" + sum);
        System.out.println(map);
    }
}
