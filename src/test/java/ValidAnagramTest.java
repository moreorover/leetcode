import org.example.ValidAnagram;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void testSimpleAnagram() {
        assertTrue(ValidAnagram.isAnagram("anagram", "nagaram"));
    }

    @Test
    void testNotAnagram() {
        assertFalse(ValidAnagram.isAnagram("rat", "car"));
    }

    @Test
    void testDifferentLengths() {
        assertFalse(ValidAnagram.isAnagram("a", "aa"));
    }

    @Test
    void testEmptyStrings() {
        assertTrue(ValidAnagram.isAnagram("", ""));
    }

    @Test
    void testCaseSensitive() {
        assertFalse(ValidAnagram.isAnagram("Hello", "hello"));
    }

    @Test
    void testSingleCharacter() {
        assertTrue(ValidAnagram.isAnagram("a", "a"));
    }

    @Test
    void testAnagramWithRepeatingLetters() {
        assertTrue(ValidAnagram.isAnagram("aabbcc", "baccab"));
    }
}
