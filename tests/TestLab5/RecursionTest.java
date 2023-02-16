package TestLab5;

import org.junit.jupiter.api.*;

import static Lab5.Recursion.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RecursionTest {
    @Order(1)
    @Test()
    @DisplayName("Test myPow(), where y =0")
    void testMyPow_yIsZero(){
        double actual = myPow(3,0);
        assertEquals(1,actual);
    }

    @Order(2)
    @Test()
    @DisplayName("Test myPow(), where y = 1")
    void testMyPow_yIsOne(){
        double actual = myPow(3,1);
        assertEquals(3,actual);
    }

    @Order(3)
    @Test()
    @DisplayName("Test myPow(), where y > 1")
    void testMyPow_yGreaterThanOne(){
        double actual = myPow(3,3);
        assertEquals(27.0, actual);
    }

    @Order(4)
    @Test()
    @DisplayName("Test reverse(), base case")
    void testReverse_baseCase(){
        String actual = reverse("a");
        assertEquals("a", actual);
    }

    @Order(5)
    @Test()
    @DisplayName("Test reverse(), normal case")
    void testReverse_normalCase(){
        String actual = reverse("ab cde");
        assertEquals("edc ba", actual);
    }

    @Order(6)
    @Test()
    @DisplayName("Test sum(), base case")
    void testArraySum_baseCase(){
        int[] values = {2};
        int actual = sum(values);
        assertEquals(2, actual);
    }

    @Order(7)
    @Test()
    @DisplayName("Test sum(), normal case")
    void testArraySum_normalCase(){
        int[] values = {2,2,3,3};
        int actual = sum(values);
        assertEquals(10, actual);
    }
}