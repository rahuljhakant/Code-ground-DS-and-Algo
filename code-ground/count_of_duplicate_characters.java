import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class count_of_duplicate_characters {
    public static void main(String[] args) {
        String word = "goodisbetterthannothing";
        char[] ch = word.toCharArray();
        Map<Character, Integer> chCount = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    counter+=1;
                }
            }
            if(counter>=2){
                chCount.put(ch[i], counter);
            }
            counter=0;
        }
        System.out.println(Collections.singletonList(chCount));
    }
}