public class Lab2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {5, -2, 3, 7, 1},
                {8, 4, -6, 2, 3},
                {-3, 1, 9, 4, 5}
        };


        DeepSeek(matrix);
    }

    static void DeepSeek(int[][] matrix){

        int count; int pozitifcounter = 0;
        for(int i = 0; i < matrix[0].length;i++){
            count = 0;
            for(int j = 0; j < matrix.length;j++){
                if(matrix[j][i] > 0) count++;
            }

            if(count == matrix.length) {

                pozitifcounter++;
            }
        }

        int[][] newmatrix = new int[matrix.length][matrix[0].length - pozitifcounter];
        int countrows = 0;
        for(int i = 0; i < matrix[0].length;i++){
            count = 0;
            for (int[] ints : matrix) {
                if (ints[i] > 0) count++;
            }

            if(count != matrix.length) {
                for(int k = 0; k < newmatrix.length;k++){
                    newmatrix[k][countrows] = matrix[k][i];
                }
                countrows++;
            }
        }
