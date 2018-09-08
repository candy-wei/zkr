package dai.hong.wei.test.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Date:18/9/6
 * Author: Candy you will like it
 * Desc: for fun
 */
public class FileIntoList {
    public static List<String> read(String filename) throws IOException {
        String s;
        List<String> list = new LinkedList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        while ((s = br.readLine()) != null) {
            list.add(s);
        }
        br.close();
        return list;
    }
}

class E10_FindWords {
    public static void main(String[] args)
            throws java.io.IOException {
        if (args.length < 2) {
            System.err.println(
                    "Usage: java E10_FindWords file words");
            return;
        }
        Set<String> words = new HashSet<String>();
        for (int i = 1; i < args.length; i++)
            words.add(args[i]);
        List<String> list = FileIntoList.read(args[0]);
        for (ListIterator<String> it =
             list.listIterator(list.size()); it.hasPrevious(); ) {
            String candidate = it.previous();
            for (String word : words)
                if (candidate.indexOf(word) != -1) {
                    System.out.println(candidate);
                    break;
                }
        }
    }
}