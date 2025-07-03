//Binary to Hexadecimal Converte
rimport java.util.*;

public class BinaryToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.nextLine();

        // Convert binary to decimal
        int dec = 0, base = 1;
        for (int i = bin.length() - 1; i >= 0; i--) {
            int digit = bin.charAt(i) - '0';
            dec += digit * base;
            base *= 2;
        }

        // Convert decimal to hexadecimal
        String hex = "";
        char[] hexChar = {'0', '1', '2', '3', '4', '5', '6', '7',
                           '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (dec > 0) {
            int rem = dec % 16;
            hex = hexChar[rem] + hex;
            dec /= 16;
        }

        System.out.println(hex);
       
    }
}
