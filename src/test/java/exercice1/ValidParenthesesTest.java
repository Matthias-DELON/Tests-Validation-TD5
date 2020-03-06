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
    public void isValid_1() {
        assertTrue(ValidParentheses.isValid("(3+4)*8"));
    }
}