package dai.hong.wei.test.string;

/**
 * Date:18/9/2
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Replacing {
    public static void main(String[] args) {
        String regex = "\\p{javaUpperCase}.*\\.";
        String phase = "Small drifts of snow were already starting to tumble downhill. The two ran through" +
                "their options.";
        System.out.println(phase.matches(regex));
    }
}
