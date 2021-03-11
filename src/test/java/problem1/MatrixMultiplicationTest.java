package problem1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MatrixMultiplicationTest {

    private ByteArrayOutputStream outContent;
    private ByteArrayOutputStream errContent;

    @BeforeEach
    void setUpStreams() {
        this.outContent = new ByteArrayOutputStream();
        this.errContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(System.out);
        System.setErr(System.err);
    }

    /*@Test
    void minMultiplicationsShouldTestReturnValueArrayCase1() {
        int[] dim = {5, 2, 3, 4, 6, 7, 8};
        int[][] order = new int[dim.length - 1][dim.length - 1];
        assertEquals(348, MatrixMultiplication.minMultiplications(dim, order));
    }*/

    /*@Test
    void minMultiplicationsShouldTestOrderArrayCase1() {
        int[] dim = {5, 2, 3, 4, 6, 7, 8};
        int[][] order = new int[dim.length - 1][dim.length - 1];
        MatrixMultiplication.minMultiplications(dim, order);
        int[][] expectedOrder = {
                {0, 1, 1, 1, 1, 1},
                {0, 0, 2, 3, 4, 5},
                {0, 0, 0, 3, 4, 5},
                {0, 0, 0, 0, 4, 5},
                {0, 0, 0, 0, 0, 5},
                {0, 0, 0, 0, 0, 0}
        };
        for (int i = 0; i < order.length; i++) {
            assertArrayEquals(expectedOrder[i], order[i]);
        }
    }*/

   /* @Test
    void minMultiplicationsShouldTestReturnValueArrayCase2() {
        int[] dim = {10, 4, 5, 20, 2, 50};
        int[][] order = new int[dim.length - 1][dim.length - 1];
        assertEquals(1320, MatrixMultiplication.minMultiplications(dim, order));
    }*/

    /*@Test
    void minMultiplicationsShouldTestOrderArrayCase2() {
        int[] dim = {10, 4, 5, 20, 2, 50};
        int[][] order = new int[dim.length - 1][dim.length - 1];
        MatrixMultiplication.minMultiplications(dim, order);
        int[][] expectedOrder = {
                {0, 1, 1, 1, 4},
                {0, 0, 2, 2, 4},
                {0, 0, 0, 3, 4},
                {0, 0, 0, 0, 4},
                {0, 0, 0, 0, 0},
        };
        for (int i = 0; i < order.length; i++) {
            assertArrayEquals(expectedOrder[i], order[i]);
        }
    }*/

    /*@Test
    void minMultiplicationsShouldTestReturnValueArrayCase3() {
        int[] dim = {10, 2, 9, 3, 4, 8, 7, 10, 11};
        int[][] order = new int[dim.length - 1][dim.length - 1];
        assertEquals(834, MatrixMultiplication.minMultiplications(dim, order));
    }*/

    /*@Test
    void minMultiplicationsShouldTestOrderArrayCase3() {
        int[] dim = {10, 2, 9, 3, 4, 8, 7, 10, 11};
        int[][] order = new int[dim.length - 1][dim.length - 1];
        MatrixMultiplication.minMultiplications(dim, order);
        int[][] expectedOrder = {
                {0, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 2, 3, 4, 5, 6, 7},
                {0, 0, 0, 3, 3, 3, 3, 3},
                {0, 0, 0, 0, 4, 5, 6, 7},
                {0, 0, 0, 0, 0, 5, 6, 7},
                {0, 0, 0, 0, 0, 0, 6, 6},
                {0, 0, 0, 0, 0, 0, 0, 7},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };
        for (int i = 0; i < order.length; i++) {
            assertArrayEquals(expectedOrder[i], order[i]);
        }
    }*/

    /*@Test
    void shouldTestOptimalOrderCase1() {
        int[] dim = {5, 2, 3, 4, 6, 7, 8};
        int[][] order = new int[dim.length - 1][dim.length - 1];
        MatrixMultiplication.minMultiplications(dim, order);
        MatrixMultiplication.optimalOrder(order, 0, 5);
        String actual = outContent.toString()
                                .replace("\r\n", "")
                                .replace("", "")
                                .replace("\n", "");
        String expected = "(A0((((A1A2)A3)A4)A5))";
        assertEquals(expected, actual);
    }*/

    /*@Test
    void shouldTestOptimalOrderCase2() {
        int[] dim = {10, 4, 5, 20, 2, 50};
        int[][] order = new int[dim.length - 1][dim.length - 1];
        MatrixMultiplication.minMultiplications(dim, order);
        MatrixMultiplication.optimalOrder(order, 0, 4);
        String actual = outContent.toString()
                .replace("\r\n", "")
                .replace("", "")
                .replace("\n", "");
        String expected = "((A0(A1(A2A3)))A4)";
        assertEquals(expected, actual);
    }*/

   /* @Test
    void shouldTestOptimalOrderCase3() {
        int[] dim = {10, 2, 9, 3, 4, 8, 7, 10, 11};
        int[][] order = new int[dim.length - 1][dim.length - 1];
        MatrixMultiplication.minMultiplications(dim, order);
        MatrixMultiplication.optimalOrder(order, 0, 7);
        String actual = outContent.toString()
                .replace("\r\n", "")
                .replace("", "")
                .replace("\n", "");
        String expected = "(A0((((((A1A2)A3)A4)A5)A6)A7))";
        assertEquals(expected, actual);
    }*/
}