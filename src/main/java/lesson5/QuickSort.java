package lesson5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {34, 56, 22, 78, 9, 3, 5, 15};
        quickSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int start, int end){

//        if (array.length == 0){
//            return;
//        }
//        if (start >= end) {
//            return;
//        }
        if (start < end) {
            int indexPivot = getIndexPivot(array, start, end);
            quickSort(array, start, indexPivot - 1);
            quickSort(array, indexPivot + 1, end);
        }
        else {
            //base
        }


    }

    private static int getIndexPivot(int[] array, int start, int end){
        int pivot = array[end];
        int indexPivot = start;
        for (int i = start; i < end; i++) {
            if(array[i] < pivot){
                swap(array, indexPivot++, i);
            }
        }
        swap(array, indexPivot, end);
        return indexPivot;
    }

    private static void swap(int [] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
