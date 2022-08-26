package lesson1homework;

import java.util.Arrays;



public class SortStudents {

    public static void main(String[] args) {
        String[] array = new String[]{
                "Ivanov",
                "Petrov",
                "Sidorov",
                "Orlov",
                "Zhukov",
                "Semenov",
                "Antonov",
                "Leonov",
                "Smirnov",
                "Botkin"
        };

       bubbleSortStudents(array);
       insertionSortStudents(array);
    }



    public static void bubbleSortStudents(String[] array){
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    String temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSortStudents(String[] array){
        for (int j = 0; j < array.length; j++) {
            int maxPos = j;
            for (int i = j; i < array.length; i++) {
                if (array[i].compareTo(array[maxPos]) > 0) {
                    maxPos = i;
                }
            }
            String temp = array [j];
            array[j] = array[maxPos];
            array[maxPos] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
