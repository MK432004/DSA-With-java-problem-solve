package recursionproblem;

public class printallpermutationofstring {
    public  void printAllPermutationOfString(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

    for (int i = 0; i < str.length(); i++) {
        char currChar = str.charAt(i);
        // "abc" -> "ab" -> "a" -> ""
        String newStr = str.substring(0, i) + str.substring(i + 1);
        printAllPermutationOfString(newStr, ans + currChar);
    }
}
public static void main(String[] args) {
    String string = "abc";
    printallpermutationofstring p = new printallpermutationofstring();
    p.printAllPermutationOfString(string, "");  
}
}