package recursionproblem;
public class calcpower {



public static int calcPower(int x, int n) {
    // Base case: any number raised to the power of 0 is 1
    if (n == 0) {
        return 1;
    }
    if (x==0){
        return 0;
    }
    int xpower = calcPower(x, n-1);
    int result = x * xpower;
    return result;
}
public static void main(String[] args) {
    int x = 2; // Base
    int n = 5;
    int ans = calcPower(x, n);
    System.out.println( ans);
}
}
// Output: 32
   