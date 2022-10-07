package lesson4.homework;

import java.util.Arrays;

//Merge strings
public class MergeStrings {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "dgk";

        System.out.println(mergeString(s1, s2));
        System.out.println(mergeStringLesson5(s1, s2));
        System.out.println(mergeStringLesson5_1(s1, s2));

    }

    private static String mergeStringLesson5(String one, String two) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < one.length() + two.length(); i++) {
            if (i < one.length() && i < two.length()) {
                char charOne = one.charAt(i);
                char charTwo = two.charAt(i);

                result.append(charOne).append(charTwo);

            } else {
                if (i < one.length()) {
                    result.append(one.charAt(i));
                }
                if (i < two.length() ){
                    result.append(two.charAt(i));
                }
            }
        }
        return result.toString();
    }


    private static String mergeStringLesson5_1(String one, String two) {
        int indexOne = 0;
        int indexTwo = 0;

        StringBuilder result = new StringBuilder();
        char [] resultArray = new char[one.length()+two.length()];
        boolean flag = false;

        for (int i = 0; i < one.length() + two.length(); i++) {
            if (i < one.length() && i < two.length()) {
                char charOne = one.charAt(indexOne);
                char charTwo = two.charAt(indexTwo);

//                result.append(charOne).append(charTwo);
                if (flag == false) {
                    resultArray[i] = one.charAt(indexOne++);
                }
                else {
                    resultArray[i] = two.charAt(indexTwo++);
                }
                flag = !flag;


            } else {
                if (i < one.length()) {
//                    result.append(one.charAt(i));
                    resultArray[indexOne++] = one.charAt(indexOne);
                }
                if (i < two.length() ){
                    resultArray[indexTwo++] = one.charAt(indexTwo);
                }
            }
        }
        return Arrays.toString(resultArray);
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
