import java.util.*;
public class Function {
    public static int multiplication(int a,int b){
        
        int multiplication = a*b;
        return multiplication;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int  multiply = multiplication(a, b);
        System.out.print( multiply);
    }
}