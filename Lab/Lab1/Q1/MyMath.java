package Lab.Lab1.Q1;

public class MyMath {
    public static int smallest(int num1, int num2, int num3){
        int min = Integer.MAX_VALUE;
        if (num1 < min) min = num1;
        if (num2 < min) min = num2;
        if (num3 < min) min = num3;
        return min;
    }

    public static int powerOf(int a, int b){
        int output = 1;
        for (int i = 0; i < b; i++) {
            output *=a;
        }
        return output;
    }

    public static int sumTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }

    public static int factorial(int n){
        if (n == 0) return 1;
        else return factorial(n-1)*n;
    }

    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if (n%i == 0) return true;
        }
        return false;
    }
}
