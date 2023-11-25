package org.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class MainTest {
    @Test
    public void testIsPalindromeWithPalindromeWord() {
        assertFalse(Main.Palindrome("A Toyota's a Toyota"));
        assertFalse(Main.Palindrome("No lemon, no melon"));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeWord() {
        assertFalse(Main.Palindrome("hello"));
        assertFalse(Main.Palindrome("world"));
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        assertTrue(Main.Palindrome(""));
    }

    @Test
    public void testIsPalindromeWithWhitespace() {
        assertTrue(Main.Palindrome("  level  "));
        assertFalse(Main.Palindrome("was it a car or a cat I saw"));
    }

    @Test
    public void testIsPalindromeWithPunctuation() {
        assertFalse(Main.Palindrome("A man, a plan, a canal, Panama!"));
        assertFalse(Main.Palindrome("Madam, in Eden, I'm Adam"));
    }
}