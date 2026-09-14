import java.util.*;
public class maxsubarrysum3 {
    public static void kdanshalgoridem(int arry []){
        int maxsum = Integer.MIN_VALUE;
        int curntsum = 0;
        for(int i=0; i<arry.length; i++){
            if(i<0){
                maxsum=i;
            }
           
        }
        for(int i=0; i<arry.length; i++){
            curntsum = curntsum + arry[i];
            if(curntsum<0){
                curntsum=0;
            }
            maxsum = Math.max(curntsum,maxsum);

        }
       System.out.println("maxsum = "+ maxsum);
    }

    public static void main(String args []){
        int arry [] = {kdan1,-2,6,-1,3};
        kdanshalgoridem(arry);
    }
}