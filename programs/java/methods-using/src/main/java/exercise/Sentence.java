package exercise;

class Sentence {
    public static void printSentence(String sentence) {
        // BEGIN
      String result = "";

      if (sentence.charAt(sentence.length() - 1) == '!') {
          System.out.println(result + sentence.toUpperCase());
      } else {
          System.out.println(result + sentence.toLowerCase());
      }
        // END
    }
}
