package dai.hong.wei.test.holding;

import java.util.ArrayList;

/**
 * Date:18/8/29
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Gerbil {
    private int gerbilNumber;
    public Gerbil(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }
    public void hop(){
        System.out.println(this + " is hopping...");
    }

    @Override
    public String toString() {
        return "gerbil "+gerbilNumber;
    }

    public static void main(String[] args) {
        ArrayList<Gerbil>  gerbils = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil(i));
        }
        for (Gerbil g: gerbils
             ) {
            g.hop();
        }
    }
}
