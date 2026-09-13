import java.util.Scanner;

public class graternumber {
    public  static void printgratertwonumber(int a, int b){
     if(a>b){
        System.out.println(" grate a");
     }else{
        System.out.println( " grater b");
     }
    

    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc. nextInt();
    printgratertwonumber(a, b);
    }
    
}
