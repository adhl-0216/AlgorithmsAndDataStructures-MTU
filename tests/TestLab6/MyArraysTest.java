package TestLab6;

import Lab6.MyArrays;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyArraysTest {

    @Test()
    void testInsertionSort() {
        int[] actual = {4, 1, 6, 2, 7};
        MyArrays.insertionSort(actual);
        int[] expected = {1, 2, 4, 6, 7};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test()
    void testMergeSort(){
        int[] actual = {12, 11, 13, 5, 6, 7};
        MyArrays.mergeSort(actual, 0, actual.length-1);
        int[] expected = {5, 6, 7, 11, 12, 13};
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}