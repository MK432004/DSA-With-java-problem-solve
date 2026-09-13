// twod arry create 
import java.util.*;
public class twodarry{

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
int r = sc.nextInt();
int c = sc.nextInt();
 int[][] markes = new int [r] [c];
// intput

for(int i= 0; i<r ; i++){
    for(int j=0; j<c; j++ ){
    markes[i][j] = sc.nextInt();

    }
}

// output
 
for(int i= 0; i<r; i++){
    for(int j=0; j<c ; j++){
        System.out.print(markes[i][j ] + " ");
    }
    System.out.println();
}

     }
}
 