package lesson2.recursive;

public class RecursiveApp {
    public static void main(String[] args) {
        char[] arr = new char[] {'h', 'e', 'l', 'l', 'o'};

        //итеративный подход
        for (int i = arr.length-1; i>=0 ; i--) {
            System.out.print(" " + arr[i]);

        }

        //T O(N)
        //S O(1)

        //рекурсия
        //мин случай - граничный условие
        //рекурсивная функция
        System.out.println();
        print(0, arr);

        //T O(N)
        //S O(N) - минус рекурсии приводит к стековерфлоу в итеративном такой ошибки нет
    }

    public static void print(int index, char[] arr){
        if (arr == null || index >= arr.length){
            return;
        }

        print(index+1, arr);
        System.out.print(" " + arr[index]);
    }
}
