package lesson3;

public class AppBinarySearch {
    public static void main(String[] args) {
        int number = 1;
        //определить является ли число квадратом числа
        //используем бинарный поиск
        System.out.println("is square: " + number + " " + isSquare(number));
    }

    private static boolean isSquare(int number) {
        int left = 1;
        int right = number / 2;
        int mid = 0;

        if (number == 1 || number == 0 || number == -1)
            return true;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (mid * mid == number)
                return true;
            if (mid * mid > number)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return false;
    }
}
