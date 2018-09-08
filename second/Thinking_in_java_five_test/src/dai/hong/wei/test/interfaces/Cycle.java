package dai.hong.wei.test.interfaces;

/**
 * Date:18/8/29
 * Author: Candy you will like it
 * Desc: for fun
 */
public interface Cycle {
    void ride();
}
interface CycleFactory{
    Cycle getCycle();
}
class Unicycle implements Cycle{
    @Override
    public void ride() {
        System.out.println("Unicycle.ride()...");
    }
}
class UncycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}
class Bicycle implements Cycle{
    @Override
    public void ride() {
        System.out.println("Bicycle.ride()...");
    }
}
class BicycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}
class Tricycle implements Cycle{
    @Override
    public void ride() {
        System.out.println("Tricycle.ride()...");
    }
}
class TricycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}
class Cycles{
    public static void doRide(CycleFactory cycleFactory){
        Cycle cycle = cycleFactory.getCycle();
        cycle.ride();
    }

    public static void main(String[] args) {
        doRide(new UncycleFactory());
        doRide(new BicycleFactory());
        doRide(new TricycleFactory());
    }
}