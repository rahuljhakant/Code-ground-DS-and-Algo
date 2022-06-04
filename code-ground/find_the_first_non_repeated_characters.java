public class find_the_first_non_repeated_characters {
    public static void main(String[] args) {
        String sample = "Goodisbetterthannothing";
        char[] ch = sample.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count += 1;
                }
            }
            if (count == 1) {
                System.out.println(ch[i]);
                break;
            }
            count = 0;
        }
    }
}
