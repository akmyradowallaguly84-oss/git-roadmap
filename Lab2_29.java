import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the A number : ");
        int A = in.nextInt();
        System.out.print("Enter the B number : ");
        int B = in.nextInt();
        for(int i = A; i <= B;i++){
            if(IsTrue(i)) System.out.print(i+", ");
        }
    }

    static boolean IsTrue(int x){
        return x==Multiply(x);
    }

    static int Multiply(int x){
        int s, l = 0;
        for(int i = 1; 0<x;i++){
            s = x%10;
            x = (x - s)/10;
            l = (l+s)*10;
        }
        return l/10;
    }
}
