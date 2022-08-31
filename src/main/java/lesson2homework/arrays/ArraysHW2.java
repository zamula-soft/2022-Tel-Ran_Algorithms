package lesson2homework.arrays;

public class ArraysHW2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 8, 6, 4, 3, 12, 10, 18, 11, 14, 7};

        //First level: Задача 1. Дан массив, вычислить рекурсивно сумму всех элементов этого массива.
        // Итоговую сумму вывести в консоль.
        System.out.println("Sum: " + sumIterative(arr));
        System.out.println("Sum: " + sumRecursive(0, arr.length-1, arr));

        //Second level: Задача 1. Дан массив, написать рекурсивный метод нахождения максимального элемента
        // в этом массиве.Максимальное число вывести в консоль.
        System.out.println("Max: " + maxIterative(arr));
        System.out.println("Max: " + maxRecursive(0, arr.length-1, arr));

    }

    private static int sumIterative(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static int sumRecursive(int left, int right, int[] arr){
        if (left == right){
            return arr[left];
        }
        return arr[left] + sumRecursive(left+1, right, arr);
    }

    private static int maxIterative(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max)
                max = arr[i];
        }
        return max;
    }

    private static int maxRecursive(int left, int right, int[] arr){
        if (left == right)
            return arr[left];

        return Math.max(arr[left], maxRecursive(left+1, right, arr));

    }


}
