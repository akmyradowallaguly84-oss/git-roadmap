public class Lab2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 7, 1, 9, 4},
                {8, 2, 6, 5, 3},
                {0, 4, 9, 2, 7},
                {5, 1, 3, 8, 6}
        };

        DeepSeek(matrix);
    }

    static void DeepSeek(int[][] matrix){
        int minindex1 = 0;
        int minindex2 = 0;
        int maxindex;

        for(int i = 0; i < matrix.length;i++){
            maxindex = 0;


            //iň ulysyny indeks boýunça tapýarys her gezek!
            for(int j = 0; j < matrix[0].length;j++){
                if(matrix[i][maxindex] < matrix[i][j]){
                    maxindex = j;
                }
            }

            //Iň kiçisini tapmak üçin deňeşdirmeleri amala aşyrýarys!
            if(i == 0) minindex2 = maxindex;
            else {
                if(matrix[minindex1][minindex2] > matrix[i][maxindex]){
                    minindex1 = i;
                    minindex2 = maxindex;
                }
            }
        }


        int[][] newmatrix = new int[matrix.length - 1][matrix[0].length];
        int rowindex = 0;
        for (int i = 0; i < matrix.length;i++){
            if(minindex1 == i) continue;
            for (int j = 0; j < matrix[0].length;j++){
                newmatrix[rowindex][j] = matrix[i][j];
            }
            rowindex++;
        }

        for(int[] i :newmatrix){
            for (int j:i){
                System.out.print(j+"  ");
            }
            System.out.println();
        }

    }

}
