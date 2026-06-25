public class Lab2{
    public static void main(String[] args){
        int[] arr = {3, 1, 8, 5, 4, 1, 2, 1};
        int count = 1;
        int maxcount = 0;
        int savenumber = 0;
        for(int i = 0; i < arr.length - 1;i++){
            count = 1;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]) count++;
            }
            if(maxcount < count) {
                maxcount = count;
                savenumber = arr[i];
            }
        }
        System.out.print(savenumber + " : " + maxcount);
    }
}
