package exercise;

class Card {
    public static void printHiddenCard(String cardNumber, int starsCount) {
        // BEGIN
        String result = "";

        for (int counter = 1; counter <= starsCount; counter ++) {
            result = result + '*';
        }

        for (int counter = 12; counter <= 15; counter ++) {
            result = result + cardNumber.charAt(counter);
        }

        System.out.println(result);
        // END
    }
}
