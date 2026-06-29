public class Lab2{
    public static void main(String[] args){
        int[][] matrix = {
                {3, 0, 4, 5, 0, 2},
                {0, 7, 8, 0, 1, 0},
                {6, 0, 2, 4, 9, 3}
        };

        int firstzeroindex = 0, lastzeroinex = 0; int counter = 0; int sum = 0;
        for(int i = 0; i < matrix.length;i++){
            counter = 0;
            for(int j = 0; j < matrix[i].length;j++){
                if(matrix[i][j] == 0) {
                    if (counter == 0) {
                        firstzeroindex = j;
                    }
                    else{
                        lastzeroinex = j;
                    }
                    counter++;
                }
            }
            if(counter >= 2) {
                for (int k = firstzeroindex + 1; k < lastzeroinex; k++) {
                    sum += matrix[i][k];
                }
            }
        }
        System.out.println(sum);
    }
}
