package TestLab6;

import Lab6.MyArrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyArraysTest {

    int[] arr;
    @BeforeEach()
    void randomlyPopulateArr(){
        arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)Math.ceil(Math.random()*100);
        }
    }

    @Test()
    void testInsertionSort() {
        int[] actual = Arrays.copyOf(arr, arr.length);
        MyArrays.insertionSort(actual);
        int[] expected = Arrays.stream(Arrays.copyOf(arr, arr.length)).sorted().toArray();
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test()
    void testMergeSort(){
        int[] actual = Arrays.copyOf(arr, arr.length);
        MyArrays.mergeSort(actual, 0,actual.length-1);
        int[] expected = Arrays.stream(Arrays.copyOf(arr, arr.length)).sorted().toArray();
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    void testSelectionSort() {
        int[] actual = Arrays.copyOf(arr, arr.length);
        MyArrays.selectionSort(actual);
        int[] expected = Arrays.stream(Arrays.copyOf(arr, arr.length)).sorted().toArray();
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}