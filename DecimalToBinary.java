import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  number: ");
        int dec = sc.nextInt();

        String bin = "";
        while (dec > 0) {
            int rem = dec % 2;
            bin = rem + bin;
            dec /= 2;
        }

        System.out.println("Binary Number is: " + bin);
    }
}
