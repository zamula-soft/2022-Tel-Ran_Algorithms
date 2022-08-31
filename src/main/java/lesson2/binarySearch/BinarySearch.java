package lesson2.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-5, -2, 0, 4, 6, 7,8, 12, 15, 16, 21, 24, 30};

        int target = 30;

        System.out.println(search(arr, target));

    }

    private static int search(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        //цикл пока левый не равен правому
        while (left <= right){
            mid = left + (right - left) / 2; //left + спасет от ошибки переполнения буфера
            if (arr[mid] == target){
                return mid;
            }

            if (arr[mid] < target){
                //работаем с правой частью
                left = mid + 1;
            }
            else {
                //работаем с левой частью
                right = mid - 1;
            }

        }
        return -1;
    }
}
