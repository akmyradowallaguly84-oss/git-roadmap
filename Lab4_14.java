public class Lab2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 2},   // birinji setir
                {3, 1, 2, 1},   // meňzeş ✅
                {4, 5, 6, 5},   // meňzeş däl ❌
                {2, 3, 1, 3},   // meňzeş ✅
                {1, 2, 4, 2}    // meňzeş däl ❌
        };


        DeepSeek(matrix);
    }

    static boolean IsTrue(int[] arr, int[] arr1){
        int length = 0;
        for(int i : arr){
            for(int j:arr1){
                if(i == j){
                    length++;
                    break;
                }
            }
        }
        return length == arr.length;
    }

    static void DeepSeek(int[][] matrix){
        int reallength = matrix.length;
        int counter = 0;
        for(int j = 0; j < matrix[0].length - 1;j++){

            for(int k = j+1;k < matrix[0].length;k++){

                if(matrix[0][j] == matrix[0][k]) {
                    matrix[0][k] = -1;
                    counter++;
                }
            }
        }

        int[] arr = new int[matrix[0].length-counter];

        int rows = 0;
        for(int j = 0; j < matrix[0].length; j++){
            if(matrix[0][j] == -1) continue;
            else {
                arr[rows] = matrix[0][j];
                rows++;
            }
        }

        for(int i = 1; i < matrix.length;i++){

            if(IsTrue(arr, matrix[i])) {
                for (int l:matrix[i]) System.out.print(l+"  ");
                System.out.println();
            }
        }


    }

}
