public class Lab2{
    public static void main(String[] args){
        int[][] matrix = {  {5,   12,    3,    8,}, {19,    2,    7,   11,}, {4,    6,    9,    1}};
        int max;
        int sum = 0;
        for(int i = 0; i < matrix.length;i++){
            max = matrix[i][0];
            for(int j = 0; j < matrix[i].length;j++){
                if(max < matrix[i][j]) max = matrix[i][j];
            }
            sum += max;
        }

        System.out.println(sum);
    }
}
