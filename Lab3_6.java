public class Lab2{
    public static void main(String[] args){
        int[] arr = {3, 1, 7, 5, 1, 7, 5, 6};
        int min = arr[0];
        for(int i:arr) {
            if(min > i) min = i;
        }
        for(int i = 0; i < arr.length;i++) {
            if(min == arr[i]) {
                System.out.print(i+", ");
            }
        }
    }
}
