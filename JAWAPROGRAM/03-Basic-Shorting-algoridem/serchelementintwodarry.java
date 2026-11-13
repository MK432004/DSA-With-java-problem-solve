



 import java.util.*;
 public class serchelementintwodarry {
    public static boolean serchelement(int matrix[][],int key){
       
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Element found at index: "+i+","+j);

                    return true;
                }
            }

        }
        System.out.println("Element not found");
        return false;
       

    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int matrix[][]= new int[3][3]; 
       
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                matrix[i][j]= sc.nextInt();
            }
        }  
        int key=sc.nextInt(); 
    serchelement(matrix , key );
    sc.close();

    }
    }

