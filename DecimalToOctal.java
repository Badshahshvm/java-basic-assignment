import java.util.*;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  number: ");
        int dec = sc.nextInt();

        String oct = "";
        while (dec > 0) {
            int rem = dec % 8;
            oct = rem + oct;
            dec /= 8;
        }

        System.out.println("Octal Number is: " + oct);
    }
}
