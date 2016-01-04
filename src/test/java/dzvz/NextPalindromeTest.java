package dzvz;

import org.junit.Test;

import static dzvz.NextPalindrome.printNextPalyndrome;

/**
 * Created by dzmirtyviarzhbitski on 1/3/16.
 */
public class NextPalindromeTest {

    @Test
    public void test() {
        printNextPalyndrome(23631L);
        printNextPalyndrome(175L);
        printNextPalyndrome(1221L);
        printNextPalyndrome(999L);
        printNextPalyndrome(9999L);
        printNextPalyndrome(9998L);
        printNextPalyndrome(10);
        printNextPalyndrome(17);
        printNextPalyndrome(555);
        printNextPalyndrome(1);
    }

}
