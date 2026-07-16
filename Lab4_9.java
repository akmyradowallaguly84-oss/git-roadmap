public class Lab2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, -5, 8, 3, -1, 6},
                {7, 1, -3, 9, 4, -2},
                {-6, 5, 0, 2, 8, 1},
                {4, -8, 7, -4, 3, 9},
                {1, 6, -2, 5, -7, 4},
                {3, 9, 4, -6, 2, -1}
        };


        DeepSeek(matrix);
    }

    static int MaxIndex(int[][] matrix) {
        int maxindex1 = 0, maxindex2 = 0;
        for(int i = 0; i < matrix.length;i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[maxindex1][maxindex2] < matrix[i][j]) {
                    maxindex1 = i;
                    maxindex2 = j;

                }

            }
        }
        return maxindex2;
    }

    static int MiniIndex(int[][] matrix) {
        int miniindex1 = 0, miniindex2 = 0;
        for(int i = 0; i < matrix.length;i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[miniindex1][miniindex2] > matrix[i][j]) {
                    miniindex1 = i;
                    miniindex2 = j;
                }

            }
        }

        return miniindex2;
    }
    
    static void DeepSeek(int[][] matrix){

        int minindex = MiniIndex(matrix);
        int maxindex = MaxIndex(matrix);
        int num = Math.min(maxindex,minindex);
        int hasyl;
        for(int i = 0; i < matrix.length;i++){
            hasyl = 1;
            for(int j = 0; j < matrix[0].length;j++){
                if(j != maxindex && j != minindex) {
                    hasyl *= matrix[i][j];
                }
            }


            for(int j = 0; j < matrix[0].length;j++){
                if(j == num){
                    System.out.print(hasyl+", ");
                }
                else if(j != maxindex && j != minindex){
                    System.out.print(matrix[i][j]+", ");
                }
            }
            System.out.println();

        }
        

    }

}
