import java.util.*;

public class OctalToDecimal
{
public static void main(String[] args)
{
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        int oct = sc.nextInt();
        int decimal = 0;
        int base = 1;

       
        while (oct > 0) {
            int r = octa % 10;
            decimal += r * base;
            base *= 8;
            octal /= 10;
        }

        System.out.println("Decimal Number is: " + decimal);
  
 }
}