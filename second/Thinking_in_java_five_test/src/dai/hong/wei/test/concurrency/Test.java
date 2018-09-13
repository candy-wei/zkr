package dai.hong.wei.test.concurrency;

import java.util.Arrays;

/**
 * Date:18/9/12
 * Author: Candy you will like it
 * Desc: for fun
 */
public class Test {

    public static void quicksort(int[] values, int low, int high) {
        int i = low, j = high;
        int pivot = values[low + (high - low) / 2];
        while (i <= j) {
            while (values[i] < pivot) {
                i++;
            }
            while (values[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(values, i, j);
                i++;
                j--;
            }
        }
        if (low < j) {
            quicksort(values, low, j);
        }
        if (i < high) {
            quicksort(values, i, high);
        }
    }

    private static void swap(int[] values, int i, int j) {
        int temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }

    public static void main(String[] args) {
        int[] values = {1,4,2,8,5,0,7,3,9,2};
        quicksort(values, 0, 9);
        System.out.println(Arrays.toString(values));
    }
}