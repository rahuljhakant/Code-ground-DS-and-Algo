public class removing_white_spaces_from_string {
    public static void main(String[] args) {
        String withSpaces = "Read and write half twenty two";
        String withOutSpaces = withSpaces.replace(" ", "");
        System.out.println(withOutSpaces);
    }
}
