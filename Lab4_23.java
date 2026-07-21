import java.util.Random;

public class Lab2 {
    public static void main(String[] args) {
        int[][] field = new int[10][10];

        DeepSeek(field);

    }


    static void DeepSeek(int[][] field) {
        Random rand = new Random();

        int[] ships = {5, 4, 4, 3, 3, 3, 2, 2, 2, 2, 1, 1, 1, 1, 1,};
        int row, col; boolean canplace; boolean iswertikal; boolean allshipplaced = false; int tempo;
        while(!allshipplaced){
            for(int i = 0; i < field.length;i++){
                for (int j =0; j < field[0].length;j++){
                    field[i][j] = 0;
                }
            }
            
            allshipplaced = true;
            
            for(int size : ships){
                tempo = 0;
                canplace = false;
                while(!canplace){
                    tempo++;
                    if(tempo > 100){
                        allshipplaced = false;
                        break;
                    }
                    canplace = true;
                    iswertikal = rand.nextBoolean();
                    if(iswertikal){
                        row = rand.nextInt(11-size);
                        col = rand.nextInt(10);
                        for(int j = col - 1; j <= col + 1;j++){
                            for(int i = row - 1; i <= row + size;i++){
                                if(j >= 0 && j < 10 && i >= 0 && i < 10 && field[i][j] == 1) {
                                    canplace = false;
                                    break;
                                }
                            }
                        }

                        if(canplace){
                            for(int i = row; i < row + size;i++){
                                field[i][col] = 1;
                            }
                        }

                    }
                    else{
                        row = rand.nextInt(10);
                        col = rand.nextInt(11-size);
                        for(int i = row - 1; i <= row + 1;i++){
                            for(int j = col - 1; j <= col + size; j++){
                                if(j >= 0 && j < 10 && i >= 0 && i < 10 && field[i][j] == 1) {
                                    canplace = false;
                                    break;
                                }
                            }
                        }
                        if(canplace){
                            for(int j = col; j < col + size;j++){
                                field[row][j] = 1;
                            }
                        }

                    }
                }
            }

        }

        for(int[] i:field){
            for(int j:i)System.out.print(j+"  ");
            System.out.println();
        }

    }

}
