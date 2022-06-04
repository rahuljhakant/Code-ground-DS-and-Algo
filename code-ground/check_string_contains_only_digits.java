import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class check_string_contains_only_digits {
    public static void main(String[] args) {
        String stringWithDigit = "aaaa";
        String regex = "[A-Za-z]";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(stringWithDigit);
        boolean matchFound = matcher.find();

        if (matchFound) {
            System.out.println("String contains alphabets");
        } else {
            System.out.println("string does not contain alphabets");
        }
    }
}
