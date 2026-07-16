public class Lab2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {54, 11, 9, 31, 7},
                {6, 0, 4, 2, 4},
                {1, 3, 7, 9, 2},
                {9, 3, 2, 6, 1},
                {4, 7, 1, 9, 0}
        };


        DeepSeek(matrix);
    }



    static void DeepSeek(int[][] matrix){
        int minindex; int count = 0;
        for(int i = 0; i < matrix.length;i++){
            minindex = 0;

            for(int j = 0; j < matrix[0].length;j++){
                if(matrix[i][minindex] > matrix[i][j]) {
                    minindex = j;
                }
            }

            for(int l = 0; l < matrix.length;l++){
                if(matrix[i][minindex] < matrix[l][minindex]){
                    break;
                }
                else if(l == matrix.length - 1) {
                    count++;
                    System.out.println("Ine eyer san : "+matrix[i][minindex]);
                }
            }


        }

        if(count == 0) System.out.println("Hiç hili eýer san ýok!!!");
    }

}
