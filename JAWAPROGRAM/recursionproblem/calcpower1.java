package recursionproblem;

public class calcpower1 {
    
    public static int calcPower(int x, int n) {
        // Base case: any number raised to the power of 0 is 1
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
         if(n%2 == 0) {
          return calcPower(x, n / 2) * calcPower(x, n / 2);
        }
        else
        {
            return x * calcPower(x, n / 2) * calcPower(x, n / 2);
        }       
        
    }

    public static void main(String[] args) {
        int x = 2; // Base
        int n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }

    
}
