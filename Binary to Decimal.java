//Binary to Decimal

import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.nextLine();
        int dec = 0;
        int base = 1;

        for (int i = bin.length() - 1; i >= 0; i--) {
            int digit = bin.charAt(i) - '0';
            dec += digit * base;
            base *= 2;
        }

        System.out.println(dec);
        
    }
}
