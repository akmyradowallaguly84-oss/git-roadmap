public class Lab2{
    public static void main(String[] args){
        int[] arr = {3, 7, 2, 7, 5, 1, 7};
        int max = 0;
        for(int i : arr) {
            if(max < i) max = i;
        }
        int l = arr.length;
        for(int i = 0; i < l; i++) {
            if(arr[i] == max) {
                for(int j = i; j < l - 1; j++){
                    arr[j] = arr[j+1];
                }
                l--;
                i--;
            }
        }
        for(int y = 0; y < l; y++) System.out.println(arr[y]);
    }
}
