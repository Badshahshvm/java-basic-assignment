
//Binary Multiplication
import java.util;

public class BinaryMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
              String b1 = sc.nextLine();
       
        String b2 = sc.nextLine();

        int d1 = 0, d2 = 0;

        for (int i = 0; i < b1.length(); i++) {
            d1 = d1 * 2 + (b1.charAt(i) - '0');
        }

        for (int i = 0; i < b2.length(); i++) {
            d2 = d2 * 2 + (b2.charAt(i) - '0');
        }

        int prod = d1 * d2;
        String bin = "";

        if (prod == 0) bin = "0";
        while (prod > 0) {
            bin = (prod % 2) + bin;
            prod /= 2;
        }

        System.out.println("Product in binary: " + bin);
     
    }
}
