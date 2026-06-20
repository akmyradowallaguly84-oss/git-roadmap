import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int max = 0;
        int beforemax = 0;
        
        System.out.print("Enter Your Number : ");
        int x = in.nextInt();
        
        while (x != 0) {
            if (x > max) {
                beforemax = max; // Öňki iň uly san indi ikinji orna düşýär
                max = x;         // Täze iň uly san bellenýär
            } else if (x > beforemax) {
                beforemax = x;   // Iň ulusy bolmasa-da, ikinjiden uly bolsa täzelenýär
            }
            
            System.out.print("Enter Your Number : ");
            x = in.nextInt();
        }
        
        System.out.println("Ikinji iň uly san: " + beforemax);
    }
}
