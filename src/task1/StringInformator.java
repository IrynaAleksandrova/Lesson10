package task1;

public class StringInformator {
    public static void getBlockOfNumbers(String str) {
        String[] array = str.split("-");
        System.out.println(String.join("-", array[0], array[2]));
    }

    public static void getLetterReplacement(String str) {
        String[] array = str.split("-");
        String result1 = str.replace(array[1], "***");
        String result2 = result1.replace(array[3], "***");
        System.out.println(result2);
    }

    public static void getLettersInLowerCase(String str) {
        String[] array = str.split("[0-9-]+");
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i].toLowerCase());
            System.out.print("/");
        }
        System.out.println();
    }

    public static void getLettersInUpperCase(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Letters:" + sb.substring(5, 8).toUpperCase() + "/" + sb.substring(14, 17).toUpperCase() +
                "/" + sb.substring(19, 20).toUpperCase() + "/" + sb.substring(21, 22).toUpperCase());
    }

    public static void getLetterSequence(String str) {
        System.out.println(str.contains("ABC") || str.contains("abc"));
    }

    public static void getStartDigitSequence(String str) {
        System.out.println(str.startsWith("555"));
    }

    public static void getEndsDigitSequence(String str) {
        System.out.println(str.endsWith("1a2b"));
    }
}
