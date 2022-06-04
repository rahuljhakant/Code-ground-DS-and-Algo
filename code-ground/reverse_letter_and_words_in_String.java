public class reverse_letter_and_words_in_String {
    public static void main(String[] args) {
        String sentence = "A quick brown fox jump over the lazy dog";
        String[] wordArray = sentence.split(" ");
        for (int a = 0; a < wordArray.length; a++) {
            char[] ch = wordArray[a].toCharArray();
            for (int i = ch.length - 1; i >= 0; i--) {
                System.out.print(ch[i]);
            }
            System.out.print((" "));
        }
    }
}
