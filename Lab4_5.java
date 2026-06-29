public class Lab2{
    public static void main(String[] args){
        int[][] matrix = {
                {3, 8, 2},
                {4, 9, 5},
                {1, 7, 6}
        };

        for (int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[i].length;j++){
                if(IsSetirTrue(i, j, matrix) && IsSutunTrue(i, j, matrix)) {
                    System.out.print(" Elementimiziň özi : "+matrix[i][j]+"\n Ine sütüni : "+i+"\n Ine setiri : "+j+'\n');
                }
            }
        }

    }

    static boolean IsSetirTrue(int i, int j, int[][] matrix){
        int min = matrix[i][j];
        for(int k = 0; k < matrix[i].length; k++) {
            if (min > matrix[i][k]) {
                min = matrix[i][k];
            }
        }
        return matrix[i][j] == min;
    }

    static boolean IsSutunTrue(int i, int j, int[][] matrix){
        int max = matrix[i][j];
        for(int k = 0; k < matrix.length; k++){
            if(matrix[k][j] > max) max = matrix[k][j];
        }
        return matrix[i][j] == max;
    }
}
