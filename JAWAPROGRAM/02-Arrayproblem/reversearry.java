public class reversearry {
    public static void reversearry(int arry[]){
        int first = 0;
        int Last = arry.length-1;
        while(first<Last){
            int tem = arry[first];
            arry[first]= arry[Last];
            arry[Last]= tem;

            first++;
            Last--;

        }

    }
    public static void main(String args[]){
        int arry [] = {2, 4 , 5, 6};
        reversearry(arry);
        System.out.print("reverse arry:");
        // print arry

        for(int i=0; i<arry.length; i++){
            System.out.print( arry[i] + " ");
          
            
        }
    }
}
