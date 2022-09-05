package lesson3;

public class AppUniArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 12, 15, 14, 12, 10, 6};
        //найти макс элемент в массиве
        AppUniArray appUniArray = new AppUniArray();
        int max = appUniArray.findMax(arr, 0, arr.length-1);
        System.out.println(max);

    }

    private int findMax(int[] array, int left, int right)
    {
        if (left == right)
            return left;

        if (right - left == 1)
            return Math.max(array[left], array[right]);

        int mid = (left + right) / 2;
        if (array[mid] > array[mid -1] && array[mid] > array[mid +1])
            return array[mid];

        if (array[mid] > array [mid - 1])
            return  findMax(array, mid + 1, right);
        else
            return findMax(array, left, mid -1);

    }
}
