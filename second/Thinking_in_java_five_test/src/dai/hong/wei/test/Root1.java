package dai.hong.wei.test;

/**
 * Date:18/8/28
 * Author: Candy you will like it
 * Desc: for fun
 */
abstract class Root1 {
    abstract void print(String str);
    Root1(){
        print("Root1.Root1()...");
    }
}
class Child extends Root1{
    private String str  = "hello";
    public void print(String str){
        System.out.println(this.str);
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.print("world...");
    }
}