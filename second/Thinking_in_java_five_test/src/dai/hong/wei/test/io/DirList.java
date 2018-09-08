package dai.hong.wei.test.io;//: io/DirList.java
// Display a directory listing using regular expressions.
// {Args: "D.*\.java"}
import java.util.regex.*;
import java.io.*;
import java.util.*;

public class DirList {
  public static void main(String[] args) {
    File path = new File("/Users/pro/aaa/Think_in_Java/TIJ4-code/io");
    String[] list;
    if(args.length == 0)
      list = path.list();
    else
      list = path.list(null);
    Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
    for(String dirItem : list)
      System.out.println(dirItem);
  }
}

class DirFilter implements FilenameFilter {
  private Pattern pattern;
  public DirFilter(String regex) {
    pattern = Pattern.compile(regex);
  }
  public boolean accept(File dir, String name) {
    return pattern.matcher(name).matches();
  }
}
class DirFilter2 {
  public static FilenameFilter filter(String regex){
    return new FilenameFilter() {
      private Pattern pattern = Pattern.compile(regex);
      @Override
      public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
      }
    };
  }
}
/* Output:
DirectoryDemo.java
DirList.java
DirList2.java
DirList3.java
*///:~
