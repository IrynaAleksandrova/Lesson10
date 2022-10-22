package task3;

public class StringInformator {

    public static void getNewLine(String str) {
        String[] words = str.split("");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                sb.append(word.charAt(i)).append(word.charAt(i));
            }
        }
        System.out.println(sb);
    }
}

