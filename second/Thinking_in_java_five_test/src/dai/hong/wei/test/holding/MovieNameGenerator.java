package dai.hong.wei.test.holding;

import net.mindview.util.Generator;

import java.util.*;

import static net.mindview.util.Print.print;

/**
 * Date:18/8/29
 * Author: Candy you will like it
 * Desc: for fun
 */
public class MovieNameGenerator implements Generator<String> {
    String[] characters = new String[]{"How To Train Your Dragor","Inside Out","Rise of the Guardians","Wreck-It Ralph","Frozen"};

    int next;
    public String next() {
        String r = characters[next];
        next = (next + 1) % characters.length;
        return r;
    } }
class E04_MovieNameGenerator {
    private static final MovieNameGenerator mng =
            new MovieNameGenerator();
    static String[] fill(String[] array) {
        for(int i = 0; i < array.length; i++)
            array[i] = mng.next();
        return array;
    }
    static Collection<String>
    fill(Collection<String> collection) {
        for(int i = 0; i < 6; i++)
            collection.add(mng.next());
        return collection;
    }
    public static void main(String[] args) {
        print(Arrays.toString(fill(new String[6])));
        print(fill(new ArrayList<String>()));
        print(fill(new LinkedList<String>()));
        print(fill(new HashSet<String>()));
        print(fill(new LinkedHashSet<String>()));
        print(fill(new TreeSet<String>()));
    }
}