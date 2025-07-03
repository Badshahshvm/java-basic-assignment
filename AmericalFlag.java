
//Write a Java program to print an American flag on the screen.


public class AmericalFlag {
    public static void main(String[] args) {
        
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println("* * * * * * ==================================");
            } else {
                System.out.println(" * * * * *  ==================================");
            }
        }

        // Print the remaining 6 stripes
        for (int i = 0; i < 6; i++) {
            System.out.println("==============================================");
        }
    }
}
