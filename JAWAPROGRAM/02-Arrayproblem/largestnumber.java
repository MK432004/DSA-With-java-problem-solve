import java.util.*;
public class largestnumber{
    public static int greastnumber(int number []){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String args[]){
        int number [] = {3, 4,5, 6,2,7};
        System.out.println("largest number : "+ greastnumber(number));
    }
}