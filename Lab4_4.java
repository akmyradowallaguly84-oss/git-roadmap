import java.util.Arrays;

public class Lab2{
    public static void main(String[] args){
        int[][] matrix = {
                {5, 9, 2, 4},
                {3, 8, 1, 7},
                {6, 2, 0, 4},
                {1, 5, 3, 9}
        };
        int Length = 0;
        for(int i = 1; i <= matrix.length;i++) {
            Length += (matrix.length) - i;
        }
        int[] overdiogonal = new int[Length];
        int[] belowdiogonal = new int[Length];
        int indexbelow = -1; int indexover = -1;
        for(int i = 0; i < matrix.length; i++){

            for (int j = 0; j < matrix.length; j++){
                if(j < i) {
                    indexbelow++;
                    belowdiogonal[indexbelow] = matrix[i][j];
                }
                else if(i < j) {
                    indexover++;
                    overdiogonal[indexover] = matrix[i][j];
                }
            }
        }
        Arrays.sort(overdiogonal);
        Arrays.sort(belowdiogonal);
        indexbelow = Length - 1;
        indexover = Length - 1;
        for(int i = 0; i < matrix.length; i++){

            for (int j = 0; j < matrix.length; j++){
                if(j < i) {
                    matrix[i][j] = belowdiogonal[indexbelow];
                    System.out.print(matrix[i][j]+", ");
                    indexbelow--;
                }
                else if(i < j) {
                    matrix[i][j] = overdiogonal[indexover];
                    System.out.print(matrix[i][j]+", ");
                    indexover--;
                }
                else System.out.print(matrix[i][j]+", ");
            }
            System.out.println();
        }
    }
}
