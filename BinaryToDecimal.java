import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int bin = sc.nextInt();
        int dec = 0, base = 1;

        while (bin > 0) {
            int rem = bin % 10;
            dec += rem * base;
            base *= 2;
            bin /= 10;
        }

        System.out.println("Decimal Number is: " + dec);
    }
}
