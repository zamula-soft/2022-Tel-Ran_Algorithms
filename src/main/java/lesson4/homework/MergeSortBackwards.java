package lesson4.homework;

import java.util.Arrays;

public class MergeSortBackwards {

    public static void main(String[] args) {
        int[] array2 = {28, 4, 334, 3, 2, 23, 8};
        System.out.println(Arrays.toString(array2));
        mergeSortBackwards(array2, array2.length);
        System.out.println(Arrays.toString(array2));
    }

    private static void mergeSortBackwards(int[] array, int length) {
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

        mergeSortBackwards(left, mid);
        mergeSortBackwards(right, length - mid);
        mergeArraysBackwards(left, right, array);
        mergeArraysLesson5(left, right, array);


    }

    private static void mergeArraysLesson5(int[] one, int[] two, int[] array){
        int indexOne = 0;
        int indexTwo = 0;
        int i = 0;

        while (indexOne < one.length && indexTwo< two.length){

            int elementOne = one[indexOne];
            int elementTwo = two[indexTwo];

            if (elementOne>elementTwo){
                array[i++] = elementOne;
                indexOne++;
            }
            else {
                array[i++] = elementTwo;
                indexTwo++;
            }

        }
        while (indexOne < one.length){
            array[i++] = one[indexOne];
            indexOne++;
        }
        while (indexTwo < two.length){
            array[i++] = two[indexTwo];
            indexTwo++;
        }
    }

    //Merge arrays
    private static void mergeArraysBackwards(int[] one, int[] two, int[] array){
        int indexOne = 0;
        int indexTwo = 0;

        for (int i = 0; i < array.length; i++) {
            if (indexOne < one.length && indexTwo< two.length) {
                int elementOne = one[indexOne];
                int elementTwo = two[indexTwo];

                if (elementOne > elementTwo) {
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
