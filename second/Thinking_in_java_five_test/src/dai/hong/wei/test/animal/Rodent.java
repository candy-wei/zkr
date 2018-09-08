package dai.hong.wei.test.animal;

/**
 * Date:18/8/28
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Rodent {
    public Rodent(){
        System.out.println("Rodent.constructor..."+a);
        a++;
    }
    public void animal() {
    }
    private int a;
}

class Mouse extends Rodent {
    public void animal() {
        System.out.println("Big Mouse...");
    }
    public Mouse(){
        System.out.println("Mouse.constructor...");
    }
}

class Gerbil extends Rodent {
    public void animal() {
        System.out.println("Big Big Gerbil...");
    }
    public Gerbil(){
        System.out.println("Gerbil.constructor...");
    }
}

class Hamster extends Rodent {
    public void animal() {
        System.out.println("Big big big Hamster...");
    }
    public Hamster(){
        System.out.println("Hamster.construtor...");
    }
}

class test {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[]{
                new Mouse(), new Gerbil(), new Hamster()
        };
        for (Rodent r : rodents
                ) {
            r.animal();
        }
    }
}