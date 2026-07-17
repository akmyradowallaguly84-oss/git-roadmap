public class Lab2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 3, 5, 8},
                {2, 6, 0, 4},
                {7, 0, 9, 1},
                {3, 1, 4, 0}
        };


        DeepSeek(matrix);
    }



    static void DeepSeek(int[][] matrix){
        int saveindex = 0; int temp = 0;

        for(int i = 0; i < matrix.length;i++){


            for(int j = 0; j < matrix[0].length;j++){
                if(matrix[i][j] == 0) {
                    saveindex = j;
                    break;
                }
            }



            if(i != saveindex){
                for(int l = 0; l < matrix[0].length;l++){
                    temp = matrix[i][l];
                    matrix[i][l] = matrix[saveindex][l];
                    matrix[saveindex][l] = temp;
                    //System.out.print(matrix[i][l]+"   "+matrix[saveindex][l]+"  :  ");
                }
            }

        }

        for(int[] ints : matrix){
            for(int j : ints) System.out.print(j + "   ");
            System.out.println();
        }

    }

}
