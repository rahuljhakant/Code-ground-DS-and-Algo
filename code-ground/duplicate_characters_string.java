import java.util.HashMap;
import java.util.Map;

class Duplicate {
    public static void main(String[] aStrings) {
        String str = "goodisbetterthannotthing";
        int counter = 0;
        Map<Character, Integer> counts = new HashMap<Character, Integer>();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    counter++;
                }
            }
            if (counter >= 2) {
                counts.put(ch[i], counter);
            }
            counter = 0;
        }
        System.out.println(counts.keySet());
    }
}