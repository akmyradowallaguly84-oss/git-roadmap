import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int counter = 0, sum = 0;
        
        System.out.print("Enter Your Number : ");
        int x = in.nextInt();
        
        // Ulanyjy 0 girizýänçä dowam edýär
        while (x != 0) {
            sum += x;
            counter++;
            System.out.print("Enter Your Number : ");
            x = in.nextInt();
        }
        
        // Nola bölünmezligi barlamak (Gorag)
        if (counter > 0) {
            System.out.println((double) sum / counter);
        } else {
            System.out.println("Hiç hili san girizilmedi.");
        }
    }
}
