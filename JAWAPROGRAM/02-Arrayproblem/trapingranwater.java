import java.util.*;
public class trapingranwater {

    public static int calculatrapingranwater(int height []){
        int n = height.length;
        // calculate left max - boundary = arry
        int leftmax [] = new int[n];
        leftmax[0] = leftmax[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(height[i],height[i-1]);
        }
        // calculate right-max boundry
        int rightmax[] = new int[n];
        rightmax[n-1] = rightmax[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], height[i+1]);
        }
        int trapingranwater = 0;
        // waterlable = Math.min(leftmax[i], rightmax[i])
        for(int i=0; i<n; i++){
            int waterlable = Math.min(leftmax[i], rightmax[i]);
         // traping ranwater += waterlable -height[i]
         trapingranwater += waterlable - height[i];

        }
    
         
     
         return trapingranwater;
}
public static void main(String args []){
    int height [] ={ 4,2,0,6,3,2,5};
   System.out.println(calculatrapingranwater(height));

}
}