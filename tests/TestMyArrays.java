import Lab3.MyArrays;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


public class TestMyArrays {
    @Test()
    void insertTest(){
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        int testResult = MyArrays.insert(arr, 4, 3, 3);
        assertEquals(5, testResult);
        System.out.println(Arrays.toString(arr));
    }

    @Test()
    void insertTest_atZero(){
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        int testResult = MyArrays.insert(arr, 4, 0, 9);
        assertEquals(5, testResult);
        System.out.println(Arrays.toString(arr));
    }

    @Test()
    void insertTest_atEnd(){
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        int testResult = MyArrays.insert(arr, 4, arr.length-1, 9);
        assertEquals(5, testResult);
        System.out.println(Arrays.toString(arr));
    }

    @Test()
    void invalidPos_end(){
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        try {
            MyArrays.insert(arr, 4, 5, 3);
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
        System.out.println(Arrays.toString(arr));
    }

    @Test()
    void invalidPos_start(){
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        try {
            MyArrays.insert(arr, 4, -1, 3);
        }catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            System.out.println(Arrays.toString(ex.getStackTrace()));
        }
        System.out.println(Arrays.toString(arr));
    }
}
