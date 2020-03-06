package exercice1;

import org.junit.*;

import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isValid_onlyParentheses_true() {
        assertTrue(ValidParentheses.isValid("(3+4)*8"));
    }

    @Test
    public void isValid_onlyCrochets_true() {
        assertTrue(ValidParentheses.isValid("[3+4]*8"));
    }

    @Test
    public void isValid_onlyAccolades_true() {
        assertTrue(ValidParentheses.isValid("{3+4}*8"));
    }

    @Test
    public void isValid_Mix_true() {
        assertTrue(ValidParentheses.isValid("[(3)+4]*{8+1}"));
    }

    @Test
    public void isValid_Mix_false() {
        assertFalse(ValidParentheses.isValid("[(3){+4]*{8+1}"));
    }
}