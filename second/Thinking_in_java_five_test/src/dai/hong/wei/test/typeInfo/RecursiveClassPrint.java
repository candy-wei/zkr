package dai.hong.wei.test.typeInfo;

import static net.mindview.util.Print.print;

/**
 * Date:18/9/4
 * Author: Candy you will like it
 * Desc: for fun
 */
public class RecursiveClassPrint {
    static void printClasses(Class<?> c) {
        // getSuperclass() returns null on Object:
        if (c == null) return;
        print(c.getDeclaredFields());
        // Produces the interfaces that this class
        // implements:
        for (Class<?> k : c.getInterfaces()) {
            print("Interface: " + k.getDeclaredFields());
            printClasses(k.getSuperclass());
        }
        printClasses(c.getSuperclass());
    }

    public static void main(String args[]) throws Exception {
        for (int i = 0; i < args.length; i++) {
            print("Displaying " + args[i]);
            printClasses(Class.forName(args[i]));
            if (i < args.length - 1)
                System.out.println("==================");
        }
    }
}