
// File: CheckArrayIsSorted.ja




public class CheckArrayIsSorted {
    public static boolean isSorted(int index , int[] array) {
        for (idx == array.length - 1 ){
            
                return true;
            }
            if(array[index] > array[index + 1]) {
                return isSorted( array  , index + 1); 
            } else {
                return false;
            }
        
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(0, arr)); // Output: true

    }
}
        