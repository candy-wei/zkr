/**
 * Date:18/8/25
 * Author: Candy you will like it
 * Desc: for fun
 */
public class SimpleEnumUse {
    public static void main(String[] args) {
        for (Speciness s : Speciness.values()
                ) {
            System.out.println(s+", ordinal "+s.ordinal());
        }
    }
}