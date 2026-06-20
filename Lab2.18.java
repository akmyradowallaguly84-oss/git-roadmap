import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int givennumber = in.nextInt();
        
        // 1. Catch the lowest edge case immediately
        if (givennumber == 0) {
            System.out.println(0);
            return; // Exit early
        }

        int xn_1 = 1, xn_2 = 0;
        int counter = 1;
        int xn = 0;

        // 2. Core loop for numbers > 0
        do {
            xn = xn_1 + xn_2;
            xn_2 = xn_1;
            xn_1 = xn;
            counter++;
        } while (xn < givennumber);

        // 3. Validation check
        if (xn == givennumber) {
            System.out.println(counter);
        } else {
            System.out.println(-1); // Not in sequence
        }
    }
}
