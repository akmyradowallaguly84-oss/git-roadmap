public class Lab2{
    public static void main(String[] args){
        int[] arr = {3, 7, 7, 5, 1, 7};
        int l = arr.length/2;
        int n;
        for(int i = 0; i < l;i++){
            n = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = n;
        }

        for(int j : arr) System.out.println(j);
    }

}
