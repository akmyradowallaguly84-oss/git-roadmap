public class Lab2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 1, 4},
                {1, 4, 3, 2},
                {4, 1, 2, 3},
                {3, 2, 4, 1}
        };

        DeepSeek(matrix);

    }


    static boolean IsSetirTrue(int[][] matrix, int i) {

        int m = matrix[0].length; int count = 0;
        int[] arr1 = new int[m];
        for(int l =  0; l < m;l++) {
            arr1[l] = l+1;
        }

        for(int u :arr1){
            for (int l:matrix[i]){
                if(u == l) {
                    count++;
                    break;
                }
            }
        }



        return count == m;
    }


    static boolean IsSutunTrue(int[][] matrix, int j) {

        int m = matrix.length; int count = 0;
        int[] arr1 = new int[m];
        for(int l =  0; l < m;l++) {
            arr1[l] = l+1;
        }

        for(int u:arr1){
            for(int i = 0; i < matrix.length;i++){
                if(u == matrix[i][j]) {
                    count++;
                    break;
                }
            }
        }


        return count == m;
    }


    static boolean HemmeSetirlerLatynmi(int[][] matrix){
        int counter = 0;
        for(int i = 0; i < matrix.length;i++){
            if(!IsSetirTrue(matrix,i)) {
                counter++;
                break;
            }
        }

        return counter == 0;
    }

    static boolean HemmeSutunlerLatynmi(int[][] matrix){
        int counter = 0;
        for(int j = 0; j < matrix[0].length; j++){
            if(!IsSutunTrue(matrix, j)) {
                counter++;
                break;
            }
        }

        return counter == 0;
    }

    static void DeepSeek(int[][] matrix){
        int counter = 0;

        if(matrix[0].length == matrix.length){
            if(HemmeSetirlerLatynmi(matrix) && HemmeSutunlerLatynmi(matrix)){
                System.out.println("Latyn Kwadraty!!!");
            }

            else {
                System.out.println("Latyn Kwadraty dal!!!");
            }



        }
        else {
            System.out.println("Latyn Matrissasy däl!!!");
        }



    }


}
