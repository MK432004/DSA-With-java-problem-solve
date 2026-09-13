import java.util.*;
public  class binaryserch {

    public static int binaryserch(int arry[], int key){
        int start = 0;
        int end = arry.length-1;
        while(start<=end){
            int mid = (start +end)/2;
            if(arry[mid] == key){
                return mid;
            }else if(arry[mid] <key){
                start = mid+1;
            }else{
               end= mid-1;
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int arry [] = { 2, 4,5, 7, 8, 9};
        int key = 7;
        System.out.println("key is :"+ binaryserch(arry,key));
       }
       
}

