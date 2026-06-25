public class Lab2{
    public static void main(String[] args){
        int[] arr = {3, 1, 7, 5, 1, 7, 5, 6};
        int m = arr[0];
        for(int i = 1; i < arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length - 1] = m;
        for (int j : arr) System.out.print(j+", ");
    }
}
