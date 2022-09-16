package lesson4.homework;

public class FindMissingElementsInArray {

    public static void main(String[] args) {
        int[] ints = {4, 7, 9, 10, 14};
        System.out.println(missingElementInArray(ints, 1));
        System.out.println(missingElementInArray(ints, 2));
        System.out.println(missingElementInArray(ints, 3));
    }

    private static int missingElementInArray(int[] array, int countNumber) {
        int result = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] == array[i] + 1) {
                continue;
            }
            int difference = array[i] - array[i - 1];

            for (int j = 1; j < difference; j++) {
                countNumber -= 1;
                result += 1;
                if (countNumber == 0) {
                    return result;
                }
            }
        }
        return result;
    }
}
