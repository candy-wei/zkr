package dai.hong.wei.test.exceptions;

/**
 * Date:18/9/1
 * Author: Candy you will like it
 * Desc: for fun
 */
public class RecoverExceptionTest {
    public static void main(String[] args) {
        while (true){
            try {
                new Resume().f();
            }catch (MyResumerException e){
                System.out.println("Exception...be throw");
                continue;
            }
            break;
        }
        System.out.println("OK");
    }
}
class MyResumerException extends Exception{}
class Resume{
    private static int count = 3;
    public void f() throws MyResumerException {
        if (--count > 0){
            throw new MyResumerException();
        }
    }
}