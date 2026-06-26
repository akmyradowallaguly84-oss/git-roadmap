public class Lab2{
    public static void main(String[] args){
        int[] arr = {1,9, 9, 5};
        int min = arr[0]; int max = arr[0];
        //minimum üçin
        for (int i : arr) {
            if (min > i) min = i;
        }
        //maksimum üçin
        for(int j : arr) {
            if (max < j) max = j;
        }

        for(int i = 0; i < arr.length;i++) {
            if(arr[i] == max) {
                arr[i] = min;
            }
            else if(arr[i] == min) {
                arr[i] = max;
            }
        }
        for (int i : arr) System.out.print(i + ", ");
    }
}
