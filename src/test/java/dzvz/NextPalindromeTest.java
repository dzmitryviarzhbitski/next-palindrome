package dzvz;

import org.junit.Test;

import static dzvz.NextPalindrome.printNextPalindrome;

/**
 * Created by dzmirtyviarzhbitski on 1/3/16.
 */
public class NextPalindromeTest {

    @Test
    public void test() {
        printNextPalindrome(23631L);
        printNextPalindrome(175L);
        printNextPalindrome(1221L);
        printNextPalindrome(999L);
        printNextPalindrome(9999L);
        printNextPalindrome(9998L);
        printNextPalindrome(10);
        printNextPalindrome(17);
        printNextPalindrome(555);
        printNextPalindrome(1);
    }

}
