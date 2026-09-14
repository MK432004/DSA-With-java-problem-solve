import java.util.*;

//  calcuate maxsubarry usinig help of prefix arry 
public class maxsubarry2 {
    public static void maxsubarry(int arry []){
         int curnsum = 0;
        int maxsum = Integer.MIN_VALUE;
       
        int prefixarry [] = new int[arry.length];
        prefixarry[0] = arry[0];
        for(int i=1; i<prefixarry.length; i++){
            prefixarry[i] = prefixarry[i-1]+ arry[i];
        }

            for(int i=0; i<arry.length;i++){
                int start = i;
                for(int j=i; j<arry.length; j++){
                    int end = j;
                    curnsum = start == 0 ? prefixarry[end] : prefixarry[end]-prefixarry[start-1];
                    if(maxsum<curnsum){
                        maxsum = curnsum;
                    }

                }
            }
            System.out.println("maxsum = " +maxsum);
        
        }

    

    public static void main(String args[]){
    int arry [] = {1,-2,6,-1,3};
    maxsubarry(arry);
    }
}