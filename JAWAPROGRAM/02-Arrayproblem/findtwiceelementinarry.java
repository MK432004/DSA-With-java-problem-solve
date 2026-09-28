public class findtwiceelementinarry {
    public static boolean findtwiceelement(int array[]){
        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] == array[j]){
                return true ;  
                }
               
            }
        }
        return false;
    }

    public static void main(String args []){
        int array [] = {1,2,3,1};
        System.out.println(findtwiceelement(array));

    }
}
