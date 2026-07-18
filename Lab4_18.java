public class Lab2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 1, 0, 0, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0},
                {0, 1, 0, 0, 0, 1, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };

        DeepSeek(matrix);


    }

    static int FirstDiogonal(int[][] matrix) {
        int counter = 0;
        int counter1 = 0;
        int maxcounter = 0, maxcounter1 = 0;
        int len = Math.min(matrix[0].length, matrix.length);
        for(int l = 0; l < matrix.length - 1;l++) {


            counter = 1;
            counter1 = 1;


            for (int j = 0; j < len && l + j < matrix.length - 1; j++) {
                if (matrix[l + j][j] == 0) {
                    if (matrix[l + j][j] == matrix[l + j + 1][j + 1]) counter++;
                }
                else {
                    maxcounter = Math.max(maxcounter, counter);
                    counter = 1;
                }
            }


            for (int j = 0; j < len && l - j > 0; j++) {
                if (matrix[l - j][j] == 0) {
                    if (matrix[l - j][j] == matrix[l - j - 1][j + 1]) counter1++;
                }
                else {
                    maxcounter1 = Math.max(maxcounter1, counter1);
                    counter1 = 1;
                }
            }



            maxcounter1 = Math.max(maxcounter1, counter1);
            maxcounter = Math.max(maxcounter, counter);
            if (maxcounter == Math.max(matrix.length, matrix[0].length) && maxcounter1 == Math.max(matrix.length, matrix[0].length)) {
                return Math.max(matrix.length, matrix[0].length);
            }

        }

        return Math.max(maxcounter, maxcounter1);
    }

    static int ThirdDiogonal(int[][] matrix) {
        int counter;
        int maxcounter = 0;


        int len = Math.min(matrix[0].length, matrix.length);
        for(int l = 0; l < matrix.length;l++) {
            counter = 1;
            for (int i = 0; i < len && i + l < matrix.length - 1; i++) {
                if (matrix[i + l][matrix[0].length - 1 - i] == 0) {
                    if (matrix[i + l][matrix[0].length - 1 - i] == matrix[i + l + 1][matrix[0].length - 2 - i]) {
                        counter++;
                    }
                }
                else {
                    maxcounter = Math.max(maxcounter, counter);
                    counter = 1;
                }
            }

            maxcounter = Math.max(maxcounter, counter);
        }

        return maxcounter;

    }

    static int SecondDiogonal(int[][] matrix) {
        int counter;
        int maxcounter = 0;
        int len = Math.min(matrix[0].length, matrix.length);
        counter = 1;
        for(int l = 0; l < matrix[0].length;l++) {
            counter = 1;
            for (int j = 0; j < len && j + l < matrix[0].length - 1; j++) {
                if (matrix[j][j + l] == 0) {
                    if (matrix[j][j + l] == matrix[j + 1][j + l + 1]) counter++;
                }
                else {
                    maxcounter = Math.max(maxcounter, counter);
                    counter = 1;
                }
            }

            maxcounter = Math.max(counter, maxcounter);
        }

        return maxcounter;
    }

    static void DeepSeek(int[][] matrix){
        int counter; int counter1; int maxcounter = 0, maxcounter1 = 0;
        for(int j = 0; j < matrix[0].length; j++){
            counter = 1;
            for (int i = 1; i < matrix.length;i++){
                if(matrix[i][j] == 0) {
                    if(matrix[i-1][j] == matrix[i][j]) counter++;
                }
                else {
                    maxcounter = Math.max(maxcounter, counter);
                    counter = 1;
                }
            }
            maxcounter = Math.max(counter, maxcounter);
        }

        for(int i = 0; i < matrix.length; i++){
            counter1 = 1;
            for (int j = 1; j < matrix[0].length;j++){
                if(matrix[i][j] == 0) {
                    if(matrix[i][j-1] == matrix[i][j]) counter1++;
                }
                else {
                    maxcounter1 = Math.max(maxcounter1, counter1);
                    counter1 = 1;
                }
            }
            maxcounter1 = Math.max(counter1, maxcounter1);
        }

        int s1 = Math.max(maxcounter, maxcounter1);
        s1 = Math.max(s1, FirstDiogonal(matrix));
        s1 = Math.max(s1, SecondDiogonal(matrix));
        s1 = Math.max(s1, ThirdDiogonal(matrix));
        System.out.println(s1);
    }

}
