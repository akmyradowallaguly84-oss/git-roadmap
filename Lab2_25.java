import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int d = in.nextInt();
        int c = in.nextInt();

        // 1. Ilki bilen 'a' sanyndan uly ýa-da deň bolan, 
        // d-ge bölünende c galyndyny berýän iň birinji sany tapýarys:
        int start = a;
        while (start % d != c) {
            start++;
        }

        // 2. Indi bolsa 'if' ulanman, göni şol sandan başlap,
        // her gezek üstüne 'd' sanyny goşup böküp gidýäris:
        for (int i = start; i <= b; i += d) {
            System.out.print(i + " ");
        }
    }
}
