package Lab6;

public class MyArrays {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int r = i;
            while (r > 0 && (arr[r - 1] > arr[r])) {
                int temp = arr[r];
                arr[r] = arr[r - 1];
                arr[r - 1] = temp;

                r--;
            }
        }
    }

    private static void merge(int[] arr, int p, int q, int r){
        // Find sizes of two subarrays to be merged
        int n1 = q - p + 1;
        int n2 = r - q;

        /* Create temp arrays */
        int[] L = new int[n1];
        int[] R = new int[n2];

        /*Copy data to temp arrays*/

        System.arraycopy(arr, p, L, 0, n1);

        System.arraycopy(arr, q + 1, R, 0, n2);

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays L, R
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = p;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] arr, int l, int r){
        if (l == r) return;

        // Find the middle point
        int m = (l + r) / 2;
        // Sort first and second halves
        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);

        // Merge the sorted halves
        merge(arr, l, m, r);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void binarySearch(int[] arr, int target){
        insertionSort(arr);

    }
}
