public class Lab2 {
    public static void main(String[] args) {
        for(int i = 100; i <= 999;i++){
            if(IsTrue(i)) System.out.print(i+", ");
        }
    }

    static boolean IsTrue(int x){
        return x==Multiply(x);
    }

    static int Multiply(int x){
        return (x*x)%1000;
    }
}
