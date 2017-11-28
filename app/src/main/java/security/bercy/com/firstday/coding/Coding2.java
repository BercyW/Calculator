package security.bercy.com.firstday.coding;

/**
 * Created by Bercy on 11/28/17.
 */

public class Coding2 {


    public static void main(String[] args) {

    }
    private static boolean checkPalindrome(String s) {

        int front = 0;
        int end = s.length()-1;
        s.toLowerCase();

        while(front < end) {


            if(s.charAt(front)!=s.charAt(end)) {
                return false;
            }



        }


        return true;
    }

}
