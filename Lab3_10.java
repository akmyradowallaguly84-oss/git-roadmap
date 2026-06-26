public class Lab2{
    public static void main(String[] args){
        int[] arr = {9, 4, 9, 6, 7, 4, 5};
        int count = 0;
        boolean searchingnumber = false;
        for(int i = 0; i < arr.length;i++) {
            for(int j = 0; j < arr.length;j++){
                if(arr[i]==arr[j]) count++;
            }

            if(count == 1) {
                System.out.println("The number is found : "+arr[i]);
                searchingnumber = true;
                break;
            }
            count = 0;
        }
        
        if(!searchingnumber) System.out.println("I am sorry for founding nothing");
    }
}
