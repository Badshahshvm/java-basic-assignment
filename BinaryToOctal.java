import java.util.*;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.nextLine();

        // Binary to Decimal
        int dec = 0, base = 1;
        for (int i = bin.length() - 1; i >= 0; i--) {
            dec += (bin.charAt(i) - '0') * base;
            base *= 2;
        }

        // Decimal to Octal
        String oct = "";
        while (dec > 0) {
            oct = (dec % 8) + oct;
            dec /= 8;
        }

        System.out.println(oct);
   
    }
}
