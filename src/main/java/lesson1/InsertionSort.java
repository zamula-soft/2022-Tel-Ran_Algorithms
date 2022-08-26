package lesson1;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{10, 2, 3, 5, 6, 1, 7, 8, 0};
        for (int j = 0; j < array.length; j++) {
            int maxPos = j;
            for (int i = j; i < array.length; i++) {
                if (array[i] > array[maxPos]) {
                    maxPos = i;
                }
            }
            int temp = array [j];
            array[j] = array[maxPos];
            array[maxPos] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
