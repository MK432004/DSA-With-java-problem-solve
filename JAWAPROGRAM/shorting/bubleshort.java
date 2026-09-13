

import java.util.*;
public class bubleshort {
    public static void printArray(int arr[]){
        for (int i=0; i<arr.length;  i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
public static void main(String args[]){
    int arry[] =   {7,8,1,3,2};
//selection short
for(int i=0; i<arry.length-1; i++){
    int smallest=i;
    for(int j=i+1; j<arry.length; j++){
        if(arry[smallest]>arry[j]){
            smallest=j;
        }
    }
    int temp=arry[smallest];
    arry[smallest]= arry[i];
    arry[i]=temp;

}
printArray(arry);
}
}