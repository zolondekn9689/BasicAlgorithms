import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;


class BruteForceAlgorithmsTest
{
    static BruteForceAlgorithms brute = new BruteForceAlgorithms();
    @org.junit.jupiter.api.Test
    void selectionSort()
    {
        int expected[] = {1, 3, 4, 5};
        int nArray[] = {1, 5, 3, 4};

        brute.selectionSort(nArray);

        assertArrayEquals(expected, nArray);

    }

    @org.junit.jupiter.api.Test
    void sequentialSearch()
    {
        //Test 1.
        int k = 3;
        int nArray[] = {1, 5, 4, 98};

        assertEquals(-1, brute.sequentialSearch(nArray, k));

    }

    @org.junit.jupiter.api.Test
    void sequentialSearchTest2()
    {
        //Test 1.
        int k = 3;
        int nArray[] = {1, 5, 4, 98, 3};

        assertEquals(4, brute.sequentialSearch(nArray, k));
    }


    @org.junit.jupiter.api.Test
    void bruteForceStringMatch()
    {

        String ex1 = "Nick";
        String ex2 = "Nick";

        //Test 1; Should return -1.
        assertEquals(0, brute.bruteForceStringMatch(ex1, ex2));

        ex2 = "Nic";
        assertEquals(0, brute.bruteForceStringMatch(ex1, ex2));

        ex2 = "Ni";
        assertEquals(0, brute.bruteForceStringMatch(ex1, ex2));


        ex2 = "ic";
        assertEquals(1, brute.bruteForceStringMatch(ex1, ex2));

        ex2 = "ck";
        assertEquals(2, brute.bruteForceStringMatch(ex1, ex2));

    }

    @org.junit.jupiter.api.Test
    void bruteForceClosestPoints()
    {
        //Expected Points.
        Point[] expected = new Point[2];

        //Predefault points.
        Point[] points = new Point[3];
        points[0] = new Point(1,1);
        points[1] = new Point(5,5);
        points[2] = new Point(2,2);

        Point[] twoClosest = brute.bruteForceClosestPoints(points);

        //Set Expected Points:
        expected[0] = points[0];
        expected[1] = points[2];

        //NOTE: TEST 1
        assertArrayEquals(expected, brute.bruteForceClosestPoints(points));

        points[0] = new Point(100, 100);
        expected[0] = points[1]; // Point 5.

        //Test 2
        assertArrayEquals(expected, brute.bruteForceClosestPoints(points));

        //Change points.
        points = new Point[5];
        points[0] = new Point(100, 100);
        points[1] = new Point(3, 3);
        points[2] = new Point(4, 4);
        points[3] = new Point(102, 102);
        points[4] = new Point(98, 98);
        expected[0] = points[1];
        expected[1] = points[2];

        //Test 3
        assertArrayEquals(expected, brute.bruteForceClosestPoints(points));


    }




}