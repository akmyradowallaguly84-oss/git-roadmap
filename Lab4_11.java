public class Lab2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 7, 2, 9},
                {4, 6, 8, 1},
                {5, 3, 7, 4},
                {2, 8, 6, 5}
        };


        DeepSeek(matrix);
    }



    static void DeepSeek(int[][] matrix){
        int minindex = 0, mincount = matrix.length; int count = 0;
        for(int j = 0; j < matrix[0].length;j++){
            count = 0;

            for (int i = 0; i < matrix.length;i++){
                if(i+j != 0) {
                    if (matrix[i][j] % (i + j) == 0) count++;
                }
            }

            if(mincount > count){
                mincount = count;
                minindex = j;
            }
        }

        System.out.println(minindex+1);

    }

}
