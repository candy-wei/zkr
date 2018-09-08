package dai.hong.wei.test.holding;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Date:18/8/30
 * Author: Candy you will like it
 * Desc: for fun
 */
public class PetMap {
    private static Map<String, Gerbil> gerbilMap = new HashMap<>();

    public static void main(String[] args) {
        gerbilMap.put("Spot" , new Gerbil(0));
        gerbilMap.put("Fuzzy", new Gerbil(9));
        gerbilMap.put("Joe", new Gerbil(3));
        gerbilMap.put("Ted", new Gerbil(4));
        gerbilMap.put("Heather", new Gerbil(5));

        Set<String> stringSet = gerbilMap.keySet();
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            Gerbil gerbil = gerbilMap.get(key);
            System.out.print(key+" : ");
            gerbil.hop();
        }
    }
}
