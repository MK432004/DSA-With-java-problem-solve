import java.util.*;
public class twodaray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows =sc.nextInt();
        int cols=sc.nextInt();
        int number[][]=new int[rows][cols];
        //input
        for(int i=0;i<rows;i++){
            for(int j=0; j<cols;j++){
                number[i][j]=sc.nextInt();

            }
        }
       // output
     
       //
//  for(int i=0;i<rows;i++){
  //          for(int j=0;j<cols;j++){
    //            System.out.println(number[i][j]+"  ");
      //      }
        //    System.out.println();
       // }
       int x=sc.nextInt();
       for(int i=0;i<rows;i++){
       for(int j=0;j<cols; j++){
         if(number[i][j]==x){

         
         System.out.print("x found of location("+i+", " +j +")");
         }
        }

        
         }
    }

}