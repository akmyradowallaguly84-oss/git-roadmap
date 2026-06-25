public class Lab2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 1, 4, 2, 5, 3, 3};
        int count = 1;
        int lentgh = arr.length;
        for(int i = 0; i < lentgh; i++){
            for(int j = i+1; j < lentgh; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    if(count > 2) {
                        for(int n = j; n < lentgh - 1;n++){
                            arr[n] = arr[n+1];
                        }
                        lentgh--;
                        j--;
                    }
                }
            }
            count = 1;
        }
        for(int g = 0; g < lentgh;g++) System.out.println(arr[g]);
    }
}
