import java.util.*;
public class smallestnumber {
    public static int smallestnum(int number[]){
    int smallest = Integer.MAX_VALUE;
    for(int i=0; i<number.length; i++){
        if(smallest > number[i]){
            smallest = number[i];
        }
    }
    return smallest;
    }

    public static void main(String args []){
        int number [] = {3,5,7,8,9,4,};
        System.out.println("smallest number :" + smallestnum(number));
    }
}