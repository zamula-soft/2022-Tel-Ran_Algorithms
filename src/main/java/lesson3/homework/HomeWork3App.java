package lesson3.homework;

public class HomeWork3App {
    public static void main(String[] args) {

        long x = 3;
        long n = 5;
        System.out.println(powRecursive(x, n));
        System.out.println(powOptimized(x, n));

        int[] array1 = {100, 112, 256, 349, 770};
        int[] array2 = {72, 86, 113, 119, 265, 445, 892};

        System.out.println("k element is " + findIndexElement(array1, array2, 7));

        int[] arr = {1, 1, 2, 2, 2, 2, 3,};
        int target = 2;
        System.out.println(timesInArr(arr, target));
    }

//    First level: 1.Даны два целых числа x и n, напишите функцию для вычисления x^n (x в степени n)
//    Первое решение выполнить рекурсивно за временную сложность O(n) - лиейная
//    Второе решение это улучшить решение 1 до временной сложности O(log n) логарифмическая

    public static long powRecursive(long x, long n) {
        if (n == 0) return 1;
        if (n == 1) return x;

        return x * powRecursive(x, n - 1);
    }

    public static long powOptimized(long x, long n) {
       if (n == 0) return 1;
        if (n == 1)
            return x;

        if (n % 2 == 0)
            return powRecursive(x * x, n / 2);

        return x * powRecursive(x, n - 1);
    }


//    Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент,
//    который будет находиться на k-й позиции в конечном отсортированном массиве.
//    Массив 1 - 100 112 256 349 770
//    Массив 2 - 72 86 113 119 265 445 892
//    к = 7
//    Вывод : 256
    public static int findIndexElement(int[] array1, int[] array2, int kIndex) {
        int k = 0;
        int arr1 = 0;
        int arr2 = 0;
        int next = 0;
        while (k < kIndex) {
            if (array1[arr1] < array2[arr2]) {
                next = array1[arr1++];
            } else {
                next = array2[arr2++];
            }
            k++;
        }
        return next;
    }


//    3.Имея отсортированный массив arr[] и число x, напишите функцию, которая подсчитывает вхождения x в arr[].
//    Ожидаемая временная сложность O(log n)
//    arr[] = {1, 1, 2, 2, 2, 2, 3,}
//    x = 2
//    Вывод: 4 раза
    public static int timesInArr(int[] array, int x) {
        int left = 0;
        int right = array.length;
        int mid = 0;

        while (left < right) {
            mid = left + (right - left) / 2;
            if (array[mid] == x)
                break;

            if (array[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (mid == 0)
            return -1;

        int result = 1;
        int index = mid - 1;
        while (index > 0 && array[index] == array[mid]) {
            result += 1;
            index -= 1;
        }

        index = mid + 1;
        while (index < array.length && array[index] == array[mid]) {
            result += 1;
            index += 1;
        }
        return result;

    }

}
