package com.example.unittest1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    StringUtils utils = new StringUtils();

    @Test
    void testReverse() {
        assertEquals("dcba", utils.reverse("abcd"));
        assertEquals("", utils.reverse(""));
        assertNull(utils.reverse(null));
        assertEquals("!dlroW ,olleH", utils.reverse("Hello, World!"));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(utils.isPalindrome("A man a plan a canal Panama"));
        assertTrue(utils.isPalindrome("Noon"));
        assertFalse(utils.isPalindrome("Hello"));
        assertFalse(utils.isPalindrome(null));
        assertTrue(utils.isPalindrome("  "));
    }

    @Test
    void testCountVowels() {
        assertEquals(5, utils.countVowels("Educative"));
        assertEquals(0, utils.countVowels(""));
        assertEquals(0, utils.countVowels("1234"));
        assertEquals(5, utils.countVowels("aeiou"));
        assertEquals(0, utils.countVowels(null));
    }
}
