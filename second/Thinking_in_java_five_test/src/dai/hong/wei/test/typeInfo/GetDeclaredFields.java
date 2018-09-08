package dai.hong.wei.test.typeInfo;

/**
 * Date:18/9/4
 * Author: Candy you will like it
 * Desc: for fun
 */

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

import static net.mindview.util.Print.print;

interface Iface {
    int i = 47;

    void f();
}

class Base implements Iface {
    String s;
    double d;

    public void f() {
        System.out.println("Base.f");
    }
}

class Composed {
    Base b;
}

class Derived extends Base {
    Composed c;
    String s;
}

public class GetDeclaredFields {
    static Set<Class<?>> alreadyDisplayed =
            new HashSet<Class<?>>();

    static void printClasses(Class<?> c) {
        // getSuperclass() returns null on Object:
        if (c == null) return;
        print(c.getName());
        Field[] fields = c.getDeclaredFields();
        if (fields.length != 0)
            print("Fields:");
        for (Field fld : fields) {
            print("   " + fld);
        }
        for (Field fld : fields) {
            Class<?> k = fld.getType();
            if (!alreadyDisplayed.contains(k)) {
                printClasses(k);
                alreadyDisplayed.add(k);
            }
        }
        // Produces the interfaces that this class
        // implements:
        for (Class<?> k : c.getInterfaces()) {
            print("Interface: " + k.getName());
            printClasses(k.getSuperclass());
        }
        printClasses(c.getSuperclass());
    }

    public static void main(String args[]) throws Exception {
        print("Displaying " + "dai.hong.wei.test.typeInfo.Derived");
        printClasses(Class.forName("dai.hong.wei.test.typeInfo.Derived"));
    }
}
