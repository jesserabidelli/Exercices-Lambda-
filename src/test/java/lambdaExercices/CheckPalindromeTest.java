package lambdaExercices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckPalindromeTest {

    @Test
    public void testCheckPalindrome(){
        CheckPalindrome checkPalindrome = new CheckPalindrome();

        Assertions.assertTrue(checkPalindrome.isWordPalindrome("kayak"));
        Assertions.assertTrue(checkPalindrome.isWordPalindrome("palindrome"));
    }
}
