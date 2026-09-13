import java.util.*;
public  class linerserch {

    


public static int linerserch(int number[], int key){

    for(int i=0;i<number.length; i++){
     if( number[i] == key){
        return i;
     }
   
    }
     return  -1;
}


    public static void main( String args []){
    int number [] = {3 , 5 ,8 , 9};
    int key = 8;
     int index = linerserch(number,key);
     if(index== -1){
        System.out.println("not found");
     }
     else{
        System.out.println("key is at index " + index);
     }
    }

}