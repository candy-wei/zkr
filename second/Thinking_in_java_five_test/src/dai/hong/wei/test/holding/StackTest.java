package dai.hong.wei.test.holding;

import java.util.LinkedList;

/**
 * Date:18/8/30
 * Author: Candy you will like it
 * Desc: for fun
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String string = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '+' ){
                stack.push(chars[i+1]);
                i++;
            }else {
                Character pop = stack.pop();
                System.out.print(pop);
            }
        }
    }
}
class Stack<T>{
    private LinkedList<T> storage = new LinkedList<>();
    public void push(T t){storage.addFirst(t);}
    public T peek(){return storage.getFirst();}
    public T pop(){return storage.removeFirst();}
    public boolean empty(){return storage.isEmpty();}
    public String toString (){return storage.toString();}
}