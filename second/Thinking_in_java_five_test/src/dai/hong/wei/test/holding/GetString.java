package dai.hong.wei.test.holding;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Date:18/8/29
 * Author: Candy you will like it
 * Desc: for fun
 */
public class GetString {
    private static int a = -1;
    public static String next(){
        String[] strings = new String[]{"How To Train Your Dragor","Inside Out","Rise of the Guardians","Wreck-It Ralph","Frozen"};
        if (++a == 5){
            a = 0;
        }
        return strings[a];
    }
    public static Collection<String> fill(Collection<String> collection){
        for (int i = 0; i < 6; i++)
            collection.add(next());
        return collection;
    }

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        LinkedList<String> strings1 = new LinkedList<>();
        HashSet<String> strings2 =  new HashSet<>();
        LinkedHashSet<String> strings3 = new LinkedHashSet<>();
        TreeSet<String> strings4 = new TreeSet<>();

        System.out.println(fill(strings));
        System.out.println(fill(strings1));
        System.out.println(fill(strings2));
        System.out.println(fill(strings3));
        System.out.println(fill(strings4));

        /*String next;
        for (int i = 0; i < 6; i++) {
            next = next();
            strings.add(next);strings1.add(next);strings2.add(next);strings3.add(next);strings4.add(next);
        }
        System.out.println(strings);
        System.out.println(strings1);
        System.out.println(strings2);
        System.out.println(strings3);
        System.out.println(strings4);*/
    }
    /*      [How To Train Your Dragor, Inside Out, Rise of the Guardians, Wreck-It Ralph, Frozen, How To Train Your Dragor]
            [How To Train Your Dragor, Inside Out, Rise of the Guardians, Wreck-It Ralph, Frozen, How To Train Your Dragor]
            [Wreck-It Ralph, Rise of the Guardians, Inside Out, How To Train Your Dragor, Frozen]
            [How To Train Your Dragor, Inside Out, Rise of the Guardians, Wreck-It Ralph, Frozen]
            [Frozen, How To Train Your Dragor, Inside Out, Rise of the Guardians, Wreck-It Ralph]*/
}
