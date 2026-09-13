public class printsubarry {
    public static void printsubarry(int arry[]){
        for(int i=0; i<arry.length ; i++){
            int start = i;
            for(int j=i; j<arry.length; j++){
                int end= j; 
                for(int k=start; k<=end;k++){
                    System.out.print(arry[k] + " ");
                }
                System.out.println();

            }
        }

    }
    public static void main(String[]args){
    int arry []= { 2, 4,6,8,9};
    printsubarry(arry);
    }
    
}
