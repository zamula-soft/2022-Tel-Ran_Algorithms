package lesson4;

import java.util.Arrays;

public class MergeSort {
    //N log(N)
    public static void main(String[] args) {

        int[] array2 = {23, 4, 334, 3, 2, 23, 8};
        System.out.println(Arrays.toString(array2));
        mergeSort(array2, array2.length);
        System.out.println(Arrays.toString(array2));

    }

    private static void mergeSort(int[] array, int length) {
        //base conditions
        if (length < 2){
            return;
        }

        //middle
        int mid = length / 2;

        //two sub-arrays for recursive
        int [] left = new int[mid];
        int [] right = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid ; i < array.length; i++) {
            right[i - mid] = array[i];
        }

        mergeSort(left, mid);
        mergeSort(right, length - mid);
        mergeArrays(left, right, array);


    }

    //Merge arrays
    private static void mergeArrays(int[] one, int[] two, int[] array){
        int indexOne = 0;
        int indexTwo = 0;

        for (int i = 0; i < array.length; i++) {
            if (indexOne < one.length && indexTwo< two.length) {
                int elementOne = one[indexOne];
                int elementTwo = two[indexTwo];

                if (elementOne < elementTwo) {
                    array[i] = elementOne;
                    indexOne++;

                } else {
                    array[i] = elementTwo;
                    indexTwo++;

                }
                continue;
            }
            if (indexOne < one.length)
            {
                array[i] = one[indexOne];
                indexOne++;
            }
            if (indexTwo < two.length)
            {
                array[i] = two[indexTwo];
                indexTwo++;
            }


        }

    }
}
