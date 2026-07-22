import java.util.ArrayList;
import java.util.List;

public class Lab2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 5, 0, 0, 8},
                {0, 3, 0, 0, 7, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 9, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };


        Delete(matrix);

    }

    static void Delete(int[][] matrix) {


        int[][] newmatrix = new int[matrix.length][matrix[0].length];

        List<int[]> nonzeros = new ArrayList<>();
        List<int[]> zeros = new ArrayList<>();

        for(int i  = 0; i < matrix.length;i++){
            for(int j = 0; j < matrix[0].length;j++){
                newmatrix[i][j] = matrix[i][j];
                if(matrix[i][j] != 0){
                    nonzeros.add(new int[] {i, j, matrix[i][j]});
                }
                else {
                    zeros.add(new int[]{i, j});
                }
            }
        }

        int counter = 1; int distance; int savenumber = 0; int mindistance = matrix.length+matrix[0].length;


        for(int[] z:zeros){
            mindistance = matrix.length+matrix[0].length;
            counter = 0;
            savenumber = 0;

            for(int[] nz:nonzeros){
                distance = Math.abs(z[0] - nz[0]) + Math.abs(z[1] - nz[1]);

                if(distance < mindistance){
                    mindistance = distance;
                    savenumber = nz[2];
                    counter = 1;
                }
                else if(distance == mindistance){
                    counter++;
                }
            }

            if(counter == 1){
                newmatrix[z[0]][z[1]] = savenumber;
            }

        }
        for (int[] S : newmatrix) {
            for (int k : S) System.out.print(k + "  ");
            System.out.println();
        }

    }
}
