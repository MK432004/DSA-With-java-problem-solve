import java.util.*;
public class selectonshort {
    public static void sellectionshort(int arry[]){
   
        for(int i=0; i<arry.length-1; i++){
             int minpostion = i;
            for(int j=i+1; j<arry.length; j++){
                if(arry[minpostion]>arry[j]){
                    minpostion=j;
                }
            }
            // swap
            int temp = arry[minpostion];
            arry[minpostion]= arry[i];
            arry[i]= temp;
        }
    }
    public static void priintarr(int arry[]){
        for(int i=0; i<arry.length; i++){
            System.out.println(arry[i]+"");
        }
        System.out.println();
    }
    public static void insertionshort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int prev = i-1;
            while (prev >=0 && arr[prev]>current) {
                arr[prev+1]= arr[prev];
                prev--;
            } 
            // iteration 
            arr[prev+1]= arr[current];
            }
        }
           
    public static void main (String args[]){
        int arry[] = {5,4,1,3,2};
        sellectionshort(arry);
        priintarr(arry);
    
}
}