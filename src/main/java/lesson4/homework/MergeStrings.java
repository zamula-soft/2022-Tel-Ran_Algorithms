package lesson4.homework;

//Merge strings
public class MergeStrings {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "dgk";

        System.out.println(mergeString(s1, s2));

    }

    private static String mergeString(String s1, String s2) {

        int length = s1.length() + s2.length();
        String result = "";


        int indexOne = 0;
        int indexTwo = 0;

        for (int i = 0; i < length; i++) {



            if (indexOne < s1.length() && indexTwo < s2.length()) {
                char elementOne = s1.charAt(indexOne);
                char elementTwo = s2.charAt(indexTwo);
                result += elementOne;
                indexOne++;
                result += elementTwo;
                indexTwo++;
                continue;
            }
            if (indexOne < s1.length()) {
                result += s1.charAt(indexOne);
                indexOne++;
            }
            if (indexTwo < s2.length()) {
                result += s2.charAt(indexTwo);
                indexTwo++;
            }
        }
        return result;
    }


}
