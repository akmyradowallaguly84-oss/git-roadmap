public class Lab2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {16, 3, 2, 13},
                {5, 10, 11, 8},
                {9, 6, 7, 12},
                {4, 15, 14, 1}
        };

        if(DeepSeek(matrix)) System.out.println("Matrissamyz jadyly!!!");
        else System.out.println("Matrissamyz jadyly däl!!!");

    }

    static boolean JadylyKwadrat(int[][] matrix){

        if(matrix.length == matrix[0].length){
            int length = matrix.length;
            for(int[] i : matrix){
                for(int j = 0; j < length - 1;j++){
                    if(i[j] > (int)Math.pow(length,2)){
                        return false;
                    }
                    else{
                        for(int l = j+1; l < length;l++){
                            if(i[j] == i[l]) return false;
                        }
                    }
                }
            }
        }
        else return false;

        return true;
    }

    static boolean HemmeSetirlerDeng(int[][] matrix){
        int length = matrix.length;
        int[] arr = new int[length];
        for(int i = 0; i < length;i++){
            for (int j = 0; j < length;j++){
                arr[i] += matrix[i][j];
            }

        }
        for(int l = 1; l < length;l++){
            if(arr[0] != arr[l]) {
                return false
            }
        }

        return true;
    }

    static boolean HemmeSutunlerDeng(int[][] matrix){
        int length = matrix.length;
        int[] arr = new int[length];
        for(int j = 0; j < length; j++){
            for (int i = 0; i < length;i++){
                arr[j] += matrix[i][j];
            }

        }
        for(int l = 1; l < length;l++){
            if(arr[0] != arr[l]) {
                return  false;
            }
        }

        return true;
    }

    static boolean DiogonallarDen(int[][] matrix){
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < matrix.length;i++){
            sum1 += matrix[i][i];
            sum2 += matrix[i][matrix.length - 1 - i];
        }
        return sum1 == sum2;
    }

    static boolean DeepSeek(int[][] matrix){


        if(JadylyKwadrat(matrix)) {
            return HemmeSetirlerDeng(matrix) && HemmeSutunlerDeng(matrix) && DiogonallarDen(matrix);
        }
        else return false;
    }

}
