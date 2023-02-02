package Lab1.Q2;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] arr1 = {1,1,1,23,4,1,3,42,4,5};
        numberCounts(arr1);
        int[] arr2 = {1,1,1,1,1};
        numberCounts(arr2);
    }

    private static void numberCounts(int[] arr){
        StringBuilder output = new StringBuilder();
        arr = Arrays.stream(arr).sorted().toArray();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i+1 == arr.length){
                if (arr[i] == arr[i-1]){
                    output.append(String.format("'%d':%d",arr[i],++count));
                }else {
                    output.append(String.format("'%d':%d",arr[i],1));
                }
                System.out.println(output);
                return;
            }
            if (arr[i] == arr[i+1]) ++count;
            else {
                output.append(String.format("'%d':%d, ",arr[i],++count));
                count = 0;
            }
        }
    }
}
