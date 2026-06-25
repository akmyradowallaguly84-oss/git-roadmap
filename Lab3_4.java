public class Lab2{
    public static void main(String[] args){
        int[] arr = {3, 7, 2, 7, 5, 1, 7};
        int[] newarr = new int[arr.length];
        int sum = 0;
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j <= i;j++){
                sum += arr[j];
            }
            newarr[i] = sum;
            sum = 0;
        }
        for(int san : newarr) System.out.print(san+", ");
    }

}
