import java.util.*;
public class array {

   // public static void main(String args[]){
     //   int[] markes= new int [4];
       // markes[0]=97;
        //markes[1]=98;
       // markes[2]=96;
       // markes[3]=95;
     //   for (int i=0; i<=4; i++){
       //     System.out.println(markes[i]);
      //  }
   // }

//}
public static void  main(String args[]){
    Scanner sc =new Scanner(System.in);
    int size =sc.nextInt();
    int []number=new int[size];
     
    for(int i=0; i<size;i++){
    number[i]=sc.nextInt();
    }
    for(int i=0;i<size;i++){
        System.out.print(number[i]   + "   ");
    }
}

}