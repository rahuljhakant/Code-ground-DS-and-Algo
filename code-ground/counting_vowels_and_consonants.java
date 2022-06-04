import java.util.HashMap;
import java.util.Map;

public class counting_vowels_and_consonants {
    public static void main(String[] args) {
        String wordsWithVowels = "onceinalifetimeisjustonce";
        char[] ch = wordsWithVowels.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int j = 0; j < wordsWithVowels.length(); j++) {
            switch (ch[j]) {
                case 'a':
                    a++;
                    map.put(ch[j], a);
                    break;
                case 'e':
                    e++;
                    map.put(ch[j], e);
                    break;
                case 'i':
                    i++;
                    map.put(ch[j], i);
                    break;
                case 'o':
                    o++;
                    map.put(ch[j], o);
                    break;
                case 'u':
                    u++;
                    map.put(ch[j], u);
                    break;
            }
        }
        System.out.println("a  :" + a);
        System.out.println("e  :" + e);
        System.out.println("i  :" + i);
        System.out.println("o  :" + o);
        System.out.println("u  :" + u);
    }
}