//Pattern display

public class PatternJava {
    public static void main(String[] args) {
      String[] pattern = {
            "   J    a   v     v  a",
            "   J   a a   v   v  a a",
            "J  J  aaaaa   V V  aaaaa",
            " JJ  a     a   V  a     a"
        };

        for (String line : pattern) {
            System.out.println(line);
        }
    }
}
