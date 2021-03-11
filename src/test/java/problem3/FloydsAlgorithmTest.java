package problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloydsAlgorithmTest {

    // DON'T TOUCH THESE VARIABLES AND METHODS
    //-------------------------------------------------------
    static final double inf = Double.POSITIVE_INFINITY;

    public static double[][] initializeWeights1() {
        double[][] weights1 = {
                {0, 1, inf, 1, 5},
                {9, 0, 3, 2, inf},
                {inf, inf, 0, 4, inf},
                {inf, inf, 2, 0, 3},
                {3, inf, inf, inf, 0}
        };
        return weights1;
    }

    public static double[][] initializeWeights2() {
        double[][] weights2 = {
            {0, 4, inf, inf, inf, 10, inf},
            {3, 0, inf, 18, inf, inf, inf},
            {inf, 6, 0, inf, inf, inf, inf},
            {inf, 5, 15, 0, 2, 19, 5},
            {inf, inf, 12, 1, 0, inf, inf},
            {inf, inf, inf, inf, inf, 0, 10},
            {inf, inf, inf, 8, inf, inf, 0}
        };
        return weights2;
    }

    static void initializePaths(int[][] paths) {
        for (int i = 0; i < paths.length; i++) {
            for (int j = 0; j < paths.length; j++) {
                paths[i][j] = -1;
            }
        }
    }

    //-------------------------------------------------------


    /*@Test
    void floydShouldTestOriginalWeights() {
        double[][] weights1 = initializeWeights1();
        int[][] paths = new int[weights1.length][weights1.length];
        initializePaths(paths);
        double[][] distances = {
                {0.0, 1.0, 3.0, 1.0, 4.0},
                {8.0, 0.0, 3.0, 2.0, 5.0},
                {10.0, 11.0, 0.0, 4.0, 7.0},
                {6.0, 7.0, 2.0, 0.0, 3.0},
                {3.0, 4.0, 6.0, 4.0, 0.0}
        };
        FloydsAlgorithm.floydPaths(weights1, paths);
        for (int i = 0; i < distances.length; i++) {
            assertArrayEquals(distances[i], weights1[i]);
        }
    }*/

    /*@Test
    void floydShouldTestOriginalPaths() {
        double[][] weights1 = initializeWeights1();
        int[][] paths = new int[weights1.length][weights1.length];
        initializePaths(paths);
        int[][] pathsExp = {
                {-1, -1, 3, -1, 3},
                {4, -1, -1, -1, 3},
                { 4, 4, -1, -1, 3},
                {4, 4, -1, -1, -1},
                {-1, 0, 3, 0, -1}
        };
        FloydsAlgorithm.floydPaths(weights1, paths);
        for (int i = 0; i < paths.length; i++) {
            assertArrayEquals(pathsExp[i], paths[i]);
        }
    }*/

    /*@Test
    void floydShouldTestSecondWeights() {
        double[][] weights2 = initializeWeights2();
        int[][] paths = new int[weights2.length][weights2.length];
        initializePaths(paths);
        double[][] distances = {
                {0, 4,	36,	22,	24,	10,	20},
                {3,	0,	32,	18,	20,	13,	23},
                {9,	6,	0,	24,	26,	19,	29},
                {8, 5,	14,	0,	2,	18,	5},
                {9, 6,	12,	1,	0,	19,	6},
                {26, 23, 32, 18, 20, 0,	10},
                {16, 13, 22, 8, 10,	26,	0}
        };
        FloydsAlgorithm.floydPaths(weights2, paths);
        for (int i = 0; i < distances.length; i++) {
            assertArrayEquals(distances[i], weights2[i]);
        }
    }*/

    /*@Test
    void floydShouldTestSecondPaths() {
        double[][] weights2 = initializeWeights2();
        int[][] paths = new int[weights2.length][weights2.length];
        initializePaths(paths);
        int[][] pathsExp = {
                {-1, -1, 4, 1, 3, -1, 5},
                {-1, -1, 4, -1, 3, 0, 3},
                {1, -1, -1, 1,	3, 1, 3},
                {1, -1, 4, -1, -1, 1, -1 },
                {3,	3, -1, -1, -1, 3, 3},
                {6,	6,	6,	6,	6,-1, -1},
                {3,	3,	4,	-1, 3,	3,	-1}
        };
        FloydsAlgorithm.floydPaths(weights2, paths);
        for (int i = 0; i < paths.length; i++) {
            assertArrayEquals(pathsExp[i], paths[i]);
        }
    }*/

    /*@Test
    void pathsShouldTestOriginalPath() {
        double[][] weights1 = initializeWeights1();
        int[][] paths = new int[weights1.length][weights1.length];
        initializePaths(paths);
        FloydsAlgorithm.floydPaths(weights1, paths);
        assertEquals("3 4 ", FloydsAlgorithm.getPath(paths, 2, 0));
        assertEquals("4 0 ", FloydsAlgorithm.getPath(paths, 3, 1));
        assertEquals("", FloydsAlgorithm.getPath(paths, 3, 2));
    }*/

    /*@Test
    void pathsShouldTestSecondPath() {
        double[][] weights2 = initializeWeights2();
        int[][] paths = new int[weights2.length][weights2.length];
        initializePaths(paths);
        FloydsAlgorithm.floydPaths(weights2, paths);
        assertEquals("3 4 ", FloydsAlgorithm.getPath(paths, 6, 2));
    }*/
}