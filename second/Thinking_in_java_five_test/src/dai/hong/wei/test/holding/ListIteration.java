package dai.hong.wei.test.holding;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Date:18/8/30
 * Author: Candy you will like it
 * Desc: for fun
 */
public class ListIteration {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list.add(0);list.add(1);list.add(2);list.add(3);list.add(4);
        ListIterator<Integer> listIterator = list.listIterator(list.size());
        System.out.println("list : "+list);
        while (listIterator.hasPrevious()){
            list1.add(listIterator.previous());
        }
        System.out.println("list1 : "+list1);
    }
}
