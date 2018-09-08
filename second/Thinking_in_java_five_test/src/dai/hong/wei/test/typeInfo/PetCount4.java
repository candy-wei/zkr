package dai.hong.wei.test.typeInfo;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import static net.mindview.util.Print.*;

/**
 * Date:18/9/4
 * Author: Candy you will like it
 * Desc: for fun
 */
public class PetCount4 {
    public static void main(String[] args) {
        TypeCounter tyc = new TypeCounter(Pet.class);
        for (Pet p :
                Pets.arrayList(20)) {
            printnb(p.getClass().getSimpleName() + " ");
            tyc.count(p);
        }
        print();
        print(tyc);
    }
}
