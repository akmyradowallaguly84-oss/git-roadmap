public class Lab2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {5, 1, 8, 3, 9},
                {3, 9, 2, 5, 7},
                {9, 5, 6, 1, 3},
                {1, 3, 9, 5, 4}
        };

        DeepSeek(matrix);


    }

    static void DeepSeek(int[][] matrix){
        int rowcounter = 0; boolean IsTrue = false; int savenumber = 0;
        for(int l:matrix[0]){
            rowcounter = 0;
            for(int i = 1; i < matrix.length;i++){

                for(int j = 0; j < matrix[0].length;j++){
                    if(l == matrix[i][j]) {
                        rowcounter++;
                        break;
                    }
                }
            }

            if(matrix.length - 1 == rowcounter){
                System.out.println(l);
                IsTrue = true;
            }

        }

        if(!IsTrue) System.out.println("Biräm ýok!!!");

    }

}
