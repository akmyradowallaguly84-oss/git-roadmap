public class Lab2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 0, 1, 1, 0, 1},
                {0, 1, 0, 0, 1, 0},
                {1, 0, 1, 0, 1, 0},
                {1, 1, 0, 0, 1, 1},
                {1, 0, 1, 1, 0, 1},
                {1, 1, 1, 0, 1, 1}
        };

        DeepSeek(matrix);


    }

    static void DeepSeek(int[][] matrix){

        int counter = 0, maxcounter = 0;
        int row = matrix.length, col = matrix[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col;j++){
                counter = 0;
                int r = i, c = j;
                while(r < row && c < col && matrix[r][c] == 0){
                    r++; c++; counter++;
                }
                maxcounter = Math.max(maxcounter, counter);
            }
        }


        for(int i = 0; i < row; i++){
            for(int j = 0; j < col;j++){
                counter = 0;
                int r = i, c = j;
                while(r >= 0 && c < col && matrix[r][c] == 0){
                    r--; c++; counter++;
                }
                maxcounter = Math.max(maxcounter, counter);
            }
        }


        for(int i = 0; i < row; i++){
            for(int j = col - 1; j >= 0;j--){
                counter = 0;
                int r = i, c = j;
                while(r < row && c >= 0 && matrix[r][c] == 0){
                    r++; c--; counter++;
                }
                maxcounter = Math.max(maxcounter, counter);
            }
        }

        for(int i = 1; i < row; i++){
            int r = i, c = col - 1; counter = 0;
            while(r >= 0 && c >= 0) {
                if(matrix[r][c] == 0){
                    counter++;
                }
                else{
                    maxcounter = Math.max(maxcounter,counter);
                    counter = 0;
                }

                r--; c--;
            }
            maxcounter = Math.max(maxcounter,counter);

        }



        for(int i = 0; i < row-1; i++){
            int r = i, c = col - 1; counter = 0;
            while(r < row && c >= 0) {
                if(matrix[r][c] == 0){
                    counter++;
                }
                else{
                    maxcounter = Math.max(maxcounter,counter);
                    counter = 0;
                }

                r++; c--;
            }
            maxcounter = Math.max(maxcounter,counter);

        }

        if(maxcounter < 5) System.out.println("Oýun gutaranoj!!!");
        else System.out.println("Oýun gutardy");

    }

}
