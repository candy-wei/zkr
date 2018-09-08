package dai.hong.wei.test.typeInfo;

import java.lang.reflect.Constructor;

/**
 * Date:18/9/5
 * Author: Candy you will like it
 * Desc: for fun
 */
class SuperToy extends FancierToy {
    int IQ;
    public SuperToy(int intelligence) { IQ = intelligence; }
    public String toString() {
        return "I'm a SuperToy. I'm smarter than you.";
    }
}
public class ReflectionToyCreation {
    public static Toy makeToy(String toyName, int IQ) {
        try {
            Class<?> tClass = Class.forName(toyName);
            for(Constructor<?> ctor : tClass.getConstructors()) {
                // Look for a constructor with a single parameter:
                Class<?>[] params = ctor.getParameterTypes();
                if(params.length == 1)
                    if(params[0] == int.class)
                        return (Toy)ctor.newInstance(
                                new Object[]{ Integer.valueOf(IQ) } );
            }
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    public static void main(String args[]) {
        System.out.println(makeToy("dai.hong.wei.test.typeInfo.SuperToy", 150));
    }
}
class FancierToy{}
