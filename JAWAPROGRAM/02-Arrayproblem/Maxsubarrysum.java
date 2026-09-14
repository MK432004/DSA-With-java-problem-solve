import  java.util.*;
public class Maxsubarrysum {
    public static void printmaxsubarrysum(int arry[] ){
        int curnsum = 0;
        int Maxsubarrysum = Integer.MIN_VALUE;
        for(int i=0; i<arry.length; i++){
            int start = i;
            for(int j=i; j <arry.length; j++){
                int end = j;
                curnsum = 0;
                for(int k=start; k<=end; k++){
                    curnsum+= arry[k];

                }
                //System.out.println(curnsum);
                if(Maxsubarrysum<curnsum){
                    Maxsubarrysum = curnsum;
                }
            }
        }
        System.out.println("Maxsum =" + Maxsubarrysum);
    }

    public static void main(String args []){
        int arry [] = { 1,-2,6,-1,3};
       printmaxsubarrysum(arry);
    }
}