package task2;

import java.util.Arrays;

public class StringInformator {
    public static void getLongestWord(String str) {
        String[] array = str.split("[ ,.]+");
        System.out.println(Arrays.toString(array));
        int count = 0;
        String result = "";
        for (String s : array) {
            if (s.length() >= count) {
                count = s.length();
                result = s;
            }
        }
        System.out.println(result);
    }

    public static void getShortestWord(String str) {
        String[] array = str.split("[ ,.]+");
        int count = Integer.MAX_VALUE;
        String result = "";
        for (String s : array) {
            if (s.length() <= count) {
                count = s.length();
                result = s;
            }
        }
        System.out.println(result);
    }
}
