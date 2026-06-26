public class Lab2{
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 2, 3, 4, 4, 4, 5, 2};
        int count = 0; int reallength = arr.length;
        //
        for(int i = 0; i < reallength;i++){
            count = 0;
            for(int j = i+1; j < reallength;j++){
                if(arr[i] == arr[j]) {
                    count++;
                    //System.out.println(count);
                    if(count >= 2){
                        count = arr[i];
                        for(int k = 0; k < reallength;k++){
                            if(count == arr[k]){
                                if(k != reallength - 1){
                                    for (int h = k; h < reallength - 1; h++) {
                                        arr[h] = arr[h + 1];
                                    }
                                    k--;
                                }
                                reallength--;
                            }
                        }
                        break;
                    }
                }
            }

        }
        for(int  h = 0; h < reallength;h++) System.out.print(arr[h]+", ");
    }
}
