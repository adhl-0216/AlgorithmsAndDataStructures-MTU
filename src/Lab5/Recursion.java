package Lab5;

import java.util.Arrays;

public class Recursion {
    public static double myPow(double x, int y) {
        if (y == 0) return 1;
        return myPow(x,--y)*x;
    }
    public static double myPow_oneLiner(double x, int y) {
        return (y == 0) ? 1 : myPow_oneLiner(x,--y)*x;
    }

    public static String reverse(String str) {
        if (str.length() == 1) return str;
        char head = str.charAt(0);
        return reverse(str.substring(1))+head;
    }
    public static String reverse_oneLiner(String str) {
        return (str.length() == 1) ? str : reverse_oneLiner(str.substring(1)) + str.charAt(0);
    }

    public static int sum(int[] values){
        if (values.length == 1) return values[0];
        int[] copy = Arrays.copyOf(values,values.length-1);
        return sum(copy) + values[values.length-1];
    }
    public static int sum_oneLiner(int[] values){
        return (values.length == 1) ? values[0] : sum_oneLiner(Arrays.copyOf(values,values.length-1)) + values[values.length-1];
    }
}
