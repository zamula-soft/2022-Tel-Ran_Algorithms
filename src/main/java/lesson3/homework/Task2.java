package lesson3.homework;

import java.util.Arrays;

public class Task2 {
//    Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент,
//    который будет находиться на k-й позиции в конечном отсортированном массиве.
//    Массив 1 - 100 112 256 349 770
//    Массив 2 - 72 86 113 119 265 445 892
//    к = 7
//    Вывод : 256

    //Решение в класса
    //Будем использовать два указателя
    //Сливаем два массива и находим элемент

    public static void main(String[] args) {

        int[] array1 = {100, 112, 256, 349, 770};
        int[] array2 = {72, 86, 113, 119, 265, 445, 892};

        System.out.println(Arrays.toString(mergeArrays(array1, array2)));
        int k = 7;
        int[] ints = mergeArrays(array1, array2);
        System.out.println(getKPositionElement(ints, k));

        System.out.println(mergeArrays(array1, array2, 7));

    }


    //Объединяем массивы
    private static int[] mergeArrays(int[] array1, int[] array2){
        int[] result = new int[array1.length + array2.length];

        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < result.length; i++) {
            if (index1 < array1.length && index2 < array2.length) {
                if (array1[index1] < array2[index2]) {
                    result[i] = array1[index1++];

                } else {
                    result[i] = array2[index2++];

                }
                continue;
            }
            if (index1 < array1.length)
            {
                result[i] = array1[index1];
            }
            else
            {
                result[i] = array2[index2];
            }


        }
        return result;
    }

    private static int getKPositionElement(int[] array, int k){
        return array[k-1];
    }



    //Объединяем массивы
    private static int mergeArrays(int[] array1, int[] array2, int k){
        int[] result = new int[array1.length + array2.length];

        int index1 = 0;
        int index2 = 0;

        int curr = array1[0];
        int count = 0;

        for (int i = 0; i < result.length; i++) {
            if (index1 < array1.length && index2 < array2.length) {
                if (array1[index1] < array2[index2]) {
                    result[i] = array1[index1];
                    curr = index1++;

                } else {
                    result[i] = array2[index2];
                    curr = index2++;

                }
                if (count == k)
                {
                    return curr;
                }
                count++;
                continue;
            }
            if (index1 < array1.length && index2 >= array2.length){
                result[i] = array1[index1];
                curr = index1++;
            }
            if (index1 >= array1.length && index2 < array2.length){
                result[i] = array2[index2];
                curr = index2++;
            }

            if (count == k)
            {
                return curr;
            }
            count++;

        }
        throw new IllegalArgumentException();
    }
}
