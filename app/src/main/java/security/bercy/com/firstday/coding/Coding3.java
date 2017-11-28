package security.bercy.com.firstday.coding;

/**
 * Created by Bercy on 11/28/17.
 */

public class Coding3 {

    public static void main(String[] args) {
       buzzCheck(50);
    }

    private  static void buzzCheck(int n) {
        String buzz = "buzz", fizz = "fizz";
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.println(buzz + fizz + " " + i);
            } else if (i % 3 == 0) {
                System.out.println(buzz + " " + i);
            } else if (i % 5 == 0) {
                System.out.println(fizz + " " + i);
            }
        }
    }
}
