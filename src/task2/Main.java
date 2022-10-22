package task2;

public class Main {
//    Дана строка произвольной длины с произвольными словами.
//    Найти самое короткое слово в строке и вывести его на экран.
//    Найти самое длинное слово в строке и вывести его на экран.
//    Если таких слов несколько, то вывести последнее из них.

    public static void main(String[] args) {
        String str = "London is the capital of Great Britain";

        StringInformator.getLongestWord(str);
        StringInformator.getShortestWord(str);
    }
}
