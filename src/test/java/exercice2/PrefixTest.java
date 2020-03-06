package exercice2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrefixTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void longestCommonPrefix_1() {
        String[] strings = {"Woutipoup", "Watipoup", "Whoa"};
        assertEquals("W", Prefix.longestCommonPrefix(strings));
    }

    @Test
    public void longestCommonPrefix_2() {
        String[] strings = {"pomme", "pommier", "pommeraie"};
        assertEquals("pomm", Prefix.longestCommonPrefix(strings));
    }

    @Test
    public void longestCommonPrefix_3() {
        String[] strings = {};
        assertEquals("", Prefix.longestCommonPrefix(strings));
    }

    @Test
    public void longestCommonPrefix_4() {
        String[] strings = {"Thracia776"};
        assertEquals("Thracia776", Prefix.longestCommonPrefix(strings));
    }

    @Test
    public void longestCommonPrefix_5() {
        String[] strings = {"Thracia776", "Woutipoup", "pomme"};
        assertEquals("", Prefix.longestCommonPrefix(strings));
    }
}