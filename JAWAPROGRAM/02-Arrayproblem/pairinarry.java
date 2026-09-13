import java.util.*;
public class pairinarry {
    public static  void pairarry(int arry[]) {

    for(int i=0; i<arry.length; i++){
    int curn = arry[i];
    for(int j=i+1; j<arry.length; j++){
        System.out.print("(" + curn + "," + arry[j] + ")");
    }
    System.out.println();
    }
        
    }

    public static void main(String[]args){
        int arry [] = {2,4,6,8,9};
        pairarry(arry);
    }
}
