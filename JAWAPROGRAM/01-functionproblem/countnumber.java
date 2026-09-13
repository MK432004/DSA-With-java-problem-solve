

import java.util.*;

public class countnumber {
    public static void count(int n) {
    Scanner sc = new Scanner(System.in);
         int positive= 0;
         int negative = 0;
         int zero = 0;
            
            for(int i=1;i<=n;i++){
            System.out.println("enter the number" + i);
            int num = sc.nextInt();
        if(num>0){
            positive++;
        }else if(num<0){
            negative++;
        }else{
            zero++;
        }
    }
        System.out.println("\nFinal Count:");
        System.out.println("positive number is " + positive);
        System.out.println("negative number is " + negative);
        System.out.println("zero number is " + zero);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        count(n);
        sc.close();
    }
    
}
