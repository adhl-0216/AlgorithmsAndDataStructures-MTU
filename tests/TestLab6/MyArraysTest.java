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
        int size = 5000;
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)Math.ceil(Math.random()*100);
        }
    }

    @Test()
    void testInsertionSort_randomArray() {
        long init = System.currentTimeMillis();

        int[] actual = Arrays.copyOf(arr, arr.length);
        MyArrays.insertionSort(actual);
        long time = System.currentTimeMillis() - init;
        System.out.println(time);

        int[] expected = Arrays.stream(Arrays.copyOf(arr, arr.length)).sorted().toArray();
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
    @Test()
    void testInsertionSort_sortedArray() {

        int[] actual = Arrays.copyOf(arr, arr.length);
        Arrays.sort(actual);

        long init = System.currentTimeMillis();
        MyArrays.insertionSort(actual);
        long time = System.currentTimeMillis() - init;

        System.out.println(time);

        int[] expected = Arrays.stream(Arrays.copyOf(arr, arr.length)).sorted().toArray();
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test()
    void testMergeSort_randomArray(){
        long init = System.currentTimeMillis();

        int[] actual = Arrays.copyOf(arr, arr.length);
        MyArrays.myMergeSort(actual);
//        MyArrays.mergeSort(actual, 0, actual.length);
        long time = System.currentTimeMillis() - init;
        System.out.println(time);

        int[] expected = Arrays.stream(Arrays.copyOf(arr, arr.length)).sorted().toArray();
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test()
    void testMergeSort_sortedArray() {

        int[] actual = Arrays.copyOf(arr, arr.length-1);
        Arrays.sort(actual);

        long init = System.currentTimeMillis();
        MyArrays.myMergeSort(actual);
//        MyArrays.mergeSort(actual, 0, actual.length-1);
        long time = System.currentTimeMillis() - init;

        System.out.println(time);

        int[] expected = Arrays.stream(Arrays.copyOf(arr, arr.length)).sorted().toArray();
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    void testSelectionSort_randomArray() {
        long init = System.currentTimeMillis();

        int[] actual = Arrays.copyOf(arr, arr.length);
        MyArrays.selectionSort(actual);
        long time = System.currentTimeMillis() - init;
        System.out.println(time);

        int[] expected = Arrays.stream(Arrays.copyOf(arr, arr.length)).sorted().toArray();
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test()
    void testSelectionSort_sortedArray() {

        int[] actual = Arrays.copyOf(arr, arr.length);
        Arrays.sort(actual);

        long init = System.currentTimeMillis();
        MyArrays.selectionSort(actual);
        long time = System.currentTimeMillis() - init;

        System.out.println(time);

        int[] expected = Arrays.stream(Arrays.copyOf(arr, arr.length)).sorted().toArray();
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

    @Test
    void testQuickSort_randomArray() {
        long init = System.currentTimeMillis();

        int[] actual = Arrays.copyOf(arr, arr.length);
        Arrays.sort(actual);
        long time = System.currentTimeMillis() - init;
        System.out.println(time);

        int[] expected = Arrays.stream(Arrays.copyOf(arr, arr.length)).sorted().toArray();
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
    @Test
    void testQuickSort_sortedArray() {
        int[] actual = Arrays.copyOf(arr, arr.length);
        Arrays.sort(actual);

        long init = System.currentTimeMillis();
        Arrays.sort(actual);
        long time = System.currentTimeMillis() - init;

        System.out.println(time);

        int[] expected = Arrays.stream(Arrays.copyOf(arr, arr.length)).sorted().toArray();
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }


}