package lesson2.recursive;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        char[] arr = new char[] {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};

        //итеративный подход
        //two pointers
        //T O(n) сейчас O(n/2)
        //S O(1)
        //14 pattern для решения алгоритмических задач

        int left = 0;
        int right = arr.length - 1; // правый

        while (left < right){
            char tmp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = tmp;
        }
        System.out.println(Arrays.toString(arr));

        //рекурсия
        reverse(0, arr.length-1, arr);
        System.out.println(Arrays.toString(arr));
    }

    //static - без создания экземпляра класса - утильные классы, только расчеты
    private static void reverse(int left, int right, char[] chars){
        if (left >= right)
            return;

        char tmp = chars[left];
        chars[left] = chars[right];
        chars[right] = tmp;
        reverse(left+1, right-1, chars);
    }

}
