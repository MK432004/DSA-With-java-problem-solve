

import java.util.*;
   public  class printarrat {

    public static void main (String args[]){
        Scanner SC = new Scanner(System.in );
        int size = SC.nextInt();
        int number [] = new int [size];
        // input size
        for(int i=0 ; i<size; i++){
            number[i] = SC.nextInt();
        }
        // out print
        for(int i=0; i<size; i++){
            System.out.println(number[i]);
        }


    }
}
