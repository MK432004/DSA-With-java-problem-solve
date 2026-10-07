public class findtargetvalu {
    public static  int targetindex(int array[] ,int target){
       int start = 0;
       int end = array.length-1;
       
       while(start<=end){
        int mid = (start + end )/2;
    if(array[mid] == target){
        return mid ;
    }else if(array[mid] < target){
        start = mid + 1;
    }
    else {
        end = mid-1;
    }
}
         return -1;
       
    }
    public static void main(String args[]){
        int target = 7;
        int array [] =  {4,5,6,7,0,1,2};
        System.out.println( "target is a : " + targetindex(array, target));
    
}
}