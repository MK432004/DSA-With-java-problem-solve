// find factorial of number 
import java.util.*;
public class factorial {

    public static int  calculatefactorial(int n){
        if(n<0){
            System.out.println("invalid number");
        }
       int factorial=1;
       for(int i = 1; i<=n; i++){
       factorial= factorial*1;
       
       }
        System.out.println(factorial);
        return factorial;
       }
    
    public static void main(String args []){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     calculatefactorial(n);
    }

}
