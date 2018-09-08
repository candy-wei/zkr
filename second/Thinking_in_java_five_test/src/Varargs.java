/**
 * Date:18/8/25
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Varargs {
    static void f(String... args) {
        for (String arg : args
                ) {
            System.out.print(arg);
        }
    }

    public static void main(String[] args) {
        Varargs.f("hello ","world!","i coming");
        String[] strs = new String[]{
                "son"," of "," bitch !"
        };
        Varargs.f(strs);
    }
}
