package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        if (sentence.equals("")) return Map.ofEntries();
        Map<String, Integer> wordsAndTheirCount = new HashMap<>();
        String[] sentenceByWords = sentence.split(" ");
        for (String word : sentenceByWords) {
            if (wordsAndTheirCount.get(word) == null) wordsAndTheirCount.put(word, 1);
            else {
                wordsAndTheirCount.put(word, wordsAndTheirCount.get(word) + 1);
            }
        }
        return wordsAndTheirCount;
    }

    public static String toString(Map<String, Integer> wordsCount) {
        if (wordsCount.isEmpty()) return "{}";
        StringBuilder result = new StringBuilder("{\n");
        for (Map.Entry<String, Integer> wordCount : wordsCount.entrySet()) {
            result.append("  ").append(wordCount.getKey()).append(": ").append(wordCount.getValue()).append("\n");
        }
        return result + "}";
    }

//    public static void main(String[] args) {
//        String sentence = "";
//        System.out.println(getWordCount(sentence));
//        Map<String, Integer> wordsCount = Map.ofEntries(
//                Map.entry("the", 1),
//                Map.entry("java", 2)
//        );
//        System.out.println(toString(wordsCount));
//    }
}
// END