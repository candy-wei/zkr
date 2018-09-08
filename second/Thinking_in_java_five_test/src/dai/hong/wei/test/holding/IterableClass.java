package dai.hong.wei.test.holding;

import java.util.Iterator;

/**
 * Date:18/8/31
 * Author: Candy you will like it
 * Desc: for fun
 */
public class IterableClass implements Iterable<String> {
    private String[] words = {"hello ","world "};
    @Override
    public Iterator<String> iterator() {

        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }
        };
    }

    public static void main(String[] args) {
        for (String s :
                new IterableClass()) {
            System.out.print(s);
        }
    }
}
