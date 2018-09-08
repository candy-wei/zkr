package dai.hong.wei.test.holding;

import typeinfo.pets.*;

import java.util.*;

/**
 * Date:18/8/31
 * Author: Candy you will like it
 * Desc: for fun
 */
public class NonCollectionSequence extends PetSquence implements Iterable<Pet>{
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            public boolean hasNext() {
                return index < pets.length;
            }
            public Pet next() { return pets[index++]; }
            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }
    public Iterable<Pet> randomized(){
            return new Iterable<Pet>(){
                public Iterator<Pet> iterator() {
                    List<Pet> list = new ArrayList<>(Arrays.asList(pets));
                    Collections.shuffle(list, new Random(47));
                    return list.iterator();
                }
            };
    }
    public Iterable<Pet> reversed(){
        return new Iterable<Pet>() {
            @Override
            public Iterator iterator() {
                return new Iterator() {
                    int current = pets.length - 1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public Object next() {
                        return pets[current--];
                    }
                };
            }
        };
    }
    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        for (Pet pet :
                nc.reversed()) {
            System.out.print(pet + " ");
        }
        System.out.println();
        for (Pet pet :
                nc.randomized()) {
            System.out.print(pet + " ");
        }
        System.out.println();
        for (Pet pet :
                nc) {
            System.out.print(pet + " ");
        }
    }
}
class PetSquence{
    protected Pet[] pets = Pets.createArray(8);
}