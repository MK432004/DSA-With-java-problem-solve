// 1d arry creation  create a arry
import java.util.*;
public class arr{
public static void main(String args[]){
 Scanner sc = new Scanner (System.in);
 int n = sc.nextInt();
 int [] arry = new int[n];
 
 for(int i=0; i<=n; i++){
     arry [i]= sc.nextInt();

 }
 for(int i=0; i<=n; i++){
    System.out.print(arry[i]);
 }


}
    
}
