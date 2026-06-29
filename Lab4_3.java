public class Lab2{
    public static void main(String[] args){
        int[][] matrix = {
                {7,   3,   5,},
                {9,   1,   8,},
                {4,   6,   2},
        };

        int s1 = 0; int s2 = 0 ; int min = matrix[0][0];

        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[i].length;j++){
                if(min > matrix[i][j]) {
                    min = matrix[i][j];
                    s1 = j;
                    s2 = i;
                }
            }

        }
        int x = -1, y = -1;
        int[][] newmatrix = new int[matrix.length - 1][matrix[0].length - 1];
        for(int i = 0; i < matrix.length;i++){
            if(i != s2) {
                x++;
                y = -1;
                for (int j = 0; j < matrix[i].length; j++) {
                    if (s1 != j) {
                        y++;
                        newmatrix[x][y] = matrix[i][j];
                        System.out.print(newmatrix[x][y]+", ");
                    }
                }
                System.out.println();
            }

        }
    }
}
