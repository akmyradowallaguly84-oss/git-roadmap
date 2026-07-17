public class Lab2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {2, 3, 2, 5, 2},
                {4, 5, 6, 7, 8},
                {1, 1, 2, 3, 4},
                {9, 8, 7, 6, 5}
        };


        DeepSeek(matrix);
    }



    static void DeepSeek(int[][] matrix){
        int counter;

        for(int[] i : matrix){
            counter = 0;


            for(int j = 0; j < i.length-1;j++){
                for(int l = j+1; l < i.length;l++){
                    if(i[j] == i[l]){
                        counter++;
                        break;
                    }
                }
            }

            if(counter > 0){
                for(int l:i) System.out.print(l+"  ");
                System.out.println();
            }

        }


    }

}
