package dai.hong.wei.test;

/**
 * Date:18/8/27
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Cycle {
    public void ride() {
        System.out.println(" go go go..." );
    }
}

class Unicycle extends Cycle {
    public void ride() {
        System.out.println("unicycle go go go..." );
    }
}

class Bicycle extends Cycle {
    public void ride() {
        System.out.println("bicycle go go go...");
    }
}

class Tricycle extends Cycle {

}

class Test {
    public static void go(Cycle cycle) {
        cycle.ride();
    }

    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        Bicycle bicycle = new Bicycle();
        Tricycle tricycle = new Tricycle();
        go(unicycle);go(bicycle);go(tricycle);
    }
}