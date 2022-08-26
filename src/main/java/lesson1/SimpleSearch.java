package lesson1;

public class SimpleSearch {
    public static void main(String[] args) {
        int [] array = new int[]{1,3,5,63,6,8,3,4};
        int target = 4;
        int position = -1;

        //time = O(n)
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                position = i;
                break;
            }

        }
    }
}
