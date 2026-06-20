public class Lab2 {
    public static void main(String[] args) {
        for(int i = 11; i <= 99;i++){
            if(IsTrue(i)) System.out.print(i+", ");
        }
    }

    static boolean IsTrue(int x){
        return x==Multiply(x);
    }

    static int Multiply(int x){
        return 2*((x-(x%10))/10)*(x%10);
    }
}
