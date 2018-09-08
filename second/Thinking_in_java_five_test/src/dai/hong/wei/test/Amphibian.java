package dai.hong.wei.test;

/**
 * Date:18/8/27
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Amphibian {
    public void show(Amphibian amphibian){
        System.out.println(amphibian);
    }

    @Override
    public String toString() {
        return "Amphibian.show(amphibian)...";
    }
}
class Frog extends Amphibian{
    public void show(Amphibian amphibian){
        System.out.println("Override Amphibian.show(amphibian)...");
    }
    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.show(frog);
    }
}