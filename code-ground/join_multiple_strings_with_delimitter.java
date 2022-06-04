import java.util.LinkedList;
import java.util.List;

public class join_multiple_strings_with_delimitter {
    public static void main(String[] args) {
        List<String> string = new LinkedList<>();
        string.add("Hello");
        string.add("my name is Rahul.");
        String newString = String.join(", ", string);
        System.out.println(newString);
    }
}
