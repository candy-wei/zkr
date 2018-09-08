package dai.hong.wei.test.interfaces;

/**
 * Date:18/8/29
 * Author: Candy you will like it
 * Desc: for fun
 */
public class SomeBody extends Human implements Badman {

    @Override
    public void doBadThings() {
        System.out.println("someBody.doBadThings()...");
    }

    @Override
    public void kill() {
        System.out.println("someBody.kill()...");
    }

    @Override
    public void fierce() {
        System.out.println("someBody.fierce()...");
    }

    @Override
    public void menace() {
        System.out.println("someBody.menace()...");
    }

    @Override
    public void destroy() {
        System.out.println("someBody.destroy()...");
    }

    @Override
    public void drinkBlood() {
        System.out.println("someBody.drinkBood()...");
    }

    @Override
    public void love() {
        System.out.println("someBody.love()...");
    }
}
