package dai.hong.wei.test.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Date:18/9/4
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Test10 {
    public static void main(String[] args) {
        String str = "Java now has regular expressions";
        String[] regexs = {"^Java","\\Berg.*","n.w\\s+h(a|i)s","s?","s*","s+","s{4}","s{1}","s{0,3}"};
        for (String regex :
                regexs) {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(str);
            while (m.find()){
                System.out.println("Match \""+m.group() + "\" at positions " + m.start() + "-" + (m.end() - 1));
            }
        }
    }
}
