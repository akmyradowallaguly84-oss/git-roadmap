import  java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Eneter the A number : ");
        int A = in.nextInt();
        System.out.print("Enter the B number : ");
        int B = in.nextInt();
        while(B<A){
            if(A/2>=B){
                if(A%2==0) {
                    A/=2;
                    System.out.println(":2");
                }
                else{
                    A--;
                    System.out.println("-1");
                }
            }
            else{
                A--;
                System.out.println("-1");
            }
        }
    }
}
