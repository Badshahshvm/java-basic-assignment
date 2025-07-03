import java.util.*;

public class BinaryToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

               
        String binary = sc.nextLine();

        // Convert binary to decimal
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            decimal += bit * Math.pow(2, power);
            power++;
        }

        // Convert decimal to hexadecimal
        String hex = "";
        char[] hexChar = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        while (decimal > 0) {
            int remainder = decimal % 16;
            hex = hexChar[remainder] + hex;
            decimal /= 16;
        }

        System.out.println("Hexadecimal number is: " + (hex.isEmpty() ? "0" : hex));
        
    }
}
