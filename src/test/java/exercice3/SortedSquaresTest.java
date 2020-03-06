package exercice3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SortedSquaresTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sortedSquares_onlyPositive() {
        int[] tab = {0, 2, 4, 17};
        int[] sol = {0, 4, 16, 289};
        assertArrayEquals(sol, SortedSquares.sortedSquares(tab));
    }

    @Test
    public void sortedSquares_onlyNegative() {
        int[] tab = {-17, -4, -2, -1};
        int[] sol = {1, 4, 16, 289};
        assertArrayEquals(sol, SortedSquares.sortedSquares(tab));
    }

    @Test
    public void sortedSquares_PositiveAndNegative() {
        int[] tab = {-5, -2, 0, 2, 4, 17};
        int[] sol = {0, 4, 4, 16, 25, 289};
        assertArrayEquals(sol, SortedSquares.sortedSquares(tab));
    }

}