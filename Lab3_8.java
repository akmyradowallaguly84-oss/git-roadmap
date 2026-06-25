public class Lab2{
    public static void main(String[] args){
        int[] arr = {3, 1, 8, 5, 4, 7, 2, 6};
        int m = 0; int n;
        for(int i = 0; i < arr.length;i++){
            if(arr[i]%2==0) {
                if(i!=m) {
                    n = arr[m];
                    arr[m] = arr[i];
                    arr[i] = n;
                }
                m++;
            }
        }
        for(int h : arr) System.out.print(h+", ");
    }
}
