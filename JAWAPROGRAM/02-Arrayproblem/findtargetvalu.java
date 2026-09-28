public class findtargetvalu {
    public static boolean targetindex(int array[] ,int target){
       
        for(int i= 0; i<array.length; i++){
            if(array[i] == target){
               return array[i];
            }
            
        }
        return -1;
    }
    public static void main(String args[]){
        int target = 0;
        int array [] =  {4,5,6,7,0,1,2};
        targetindex(array,0);
    }
    
}
